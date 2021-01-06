package website.skylorbeck.sentimentality2;


import io.netty.buffer.Unpooled;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.server.ServerTickCallback;
import net.fabricmc.fabric.api.network.ServerSidePacketRegistry;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;

import java.util.Objects;

public class Main implements ModInitializer {
    public static final Identifier sentimentality2_get_seed= new Identifier("sentimentality2", "get_seed");

    @Override
    public void onInitialize() {
        //Logger.getLogger(Ref.MODID).log(Level.WARNING,"This is when Main is loaded");
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);//register config asap to prevent errors down the line
        ServerSidePacketRegistry.INSTANCE.register(sentimentality2_get_seed, (packetContext, attachedData) -> {//get blank trigger packet
            packetContext.getTaskQueue().execute(() -> {
                PacketByteBuf data = new PacketByteBuf(Unpooled.buffer());
                data.writeLong(Objects.requireNonNull(packetContext.getPlayer().getEntityWorld().getServer()).getOverworld().getSeed());//send seed back
                ServerSidePacketRegistry.INSTANCE.sendToPlayer(packetContext.getPlayer(), ClientMain.sentimentality2_send_seed, data);
            });
        });
        Registrar.register();//register everything serverside
        ServerTickCallback.EVENT.register(SleepEventManager::onTick);
        Ref.getSettings();//gets all settings at launch to save on file reads. Certain settings would read every frame(!) insanely bad
        AutoConfig.getConfigHolder(ModConfig.class).registerSaveListener((manager, data) ->{//listen for config file changes
            Ref.getSomeSettings();//gets settings that don't need a full restart to properly do.
            //Logger.getLogger(Ref.MODID).log(Level.WARNING,"SAVE EVENT TRIGGERED");//this was used to help me see if it was actually working
            return ActionResult.SUCCESS;
        });
    }

}
