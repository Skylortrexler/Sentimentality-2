package website.skylorbeck.sentimentality2;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import net.minecraft.world.World;

import java.time.LocalTime;
import java.util.List;

public class ExtraHUD {
    private final MinecraftClient client;

    public ExtraHUD() {
        client = MinecraftClient.getInstance();
        HudRenderCallback.EVENT.register((__, ___) -> this.render());
    }


    private void render() {
        boolean military = Registrar.getConfig().clockStuff.clockMilitary;//check to see if the user wants custom settings
        boolean doAmPm = Registrar.getConfig().clockStuff.clockAmPm;
        boolean showSleepCount = Registrar.getConfig().sleepStuff.showSleepCount;
        boolean showItems = Registrar.getConfig().showItems;
        int clockCorner = Registrar.getConfig().clockStuff.clockCorner;
        //gotta get a lot of references here
        final PlayerEntity player = client.player;
        if (player == null) return;
        final World world = client.world;
        assert world != null;
        long time = world.getTimeOfDay();//will never nullpointer because we have to be in game to get here
        final Inventory inventory = player.inventory;
        final TextRenderer textRenderer = client.textRenderer;
        final ItemRenderer itemRenderer = client.getItemRenderer();
        final MatrixStack matrixStack = new MatrixStack();
        int scaledWidth = this.client.getWindow().getScaledWidth();//these are CRITICAL for dynamically scaled ui elements
        int scaledHeight = this.client.getWindow().getScaledHeight();
        int color;
        int slotsUsed = 0;
        int localHour = LocalTime.now().getHour();
        int localMinute = LocalTime.now().getMinute();
        String amPm = "AM";
        boolean left = false;
        if (client.options.mainArm == Arm.LEFT){left = true;}//if player left handed


        if (time >= 24000) {//compensate for the fact that time is counted upwards forever
            time = time - (24000 * Math.floorDiv(time, 24000));//chop off 24,000 ticks if time is over 24,000 ticks
        }
        boolean isNight = (time < 23460) && (time > 12377);//was used for sleep calculations at one point. Times are based off minecraft wiki times light level changes

        if(showItems) {
            for (int i = 9; i < 36; i++) {//check every slot in the players inventory starting from the top left
                ItemStack stack = inventory.getStack(i);
                Item item = stack.getItem();
                if (item == Items.CLOCK
                        || item == Items.COMPASS
                        || item == Declarer.personal_daylight_detector
                        || item == Declarer.slime_chunk_locator
                ) {
                    if (left) {//flip where the icons is rendered if the player is left handed to account for the offhand slot
                        itemRenderer.renderInGuiWithOverrides(inventory.getStack(i), scaledWidth / 2 - (109 + (15 * slotsUsed)), scaledHeight - 19);
                    } else {
                        itemRenderer.renderInGuiWithOverrides(inventory.getStack(i), scaledWidth / 2 + (92 + (15 * slotsUsed)), scaledHeight - 19);//add 15 pixels for each item already rendered
                    }
                    slotsUsed++;
                }
            }
        }

        int sleeping = 0;
        List playerEntities = world.getPlayers();
        for (int i = 0; i < playerEntities.size(); i++) {//count all sleeping players
            if (world.getPlayers().get(i).isSleeping()) {
                sleeping++;
            }
        }
        if (sleeping >= 1 && showSleepCount) {//if at least one person is sleeping and the player has the icon enabled
            int sleepAdj = 0;
            if(clockCorner == 2){//if the clock is in the bottom left, move the sleep icon up by 8px
                sleepAdj = 8;
            }
            itemRenderer.renderInGui(new ItemStack(Items.RED_BED), 0, scaledHeight - 18 - sleepAdj);
            if (sleeping * 100 / playerEntities.size() >= SleepEventManager.percent) {//calculate percent of players sleeping, defaults to 50%
                color = 43520;//green
            } else {
                color = 16733525;//orange-red
            }
            int total = playerEntities.size();
            textRenderer.drawWithShadow(matrixStack, sleeping + "/" + total, 20, scaledHeight - 10 - sleepAdj, color);//show how many people are sleeping
        }
        if (localHour >=12){//show pm if after noon
             amPm = "PM";
        }
        if (!military && localHour >= 13) {//convert military time to standard time if its at least 1pm and not military enabled
            localHour = localHour - 12;
        }
        int clockPosX = 0;
        int clockPosY = 0;
        int clockAdj = 0;
        switch (clockCorner){
            case 0://top left
                clockPosX = 1;
                clockPosY = 1;
                clockAdj = 0;
                break;
            case 1://top right
                clockPosX = scaledWidth - 38;
                clockPosY = 1;
                clockAdj = -12;
                break;
            case 2://bottom left
                clockPosX = 1;
                clockPosY = scaledHeight-8;
                clockAdj = 0;
                break;
            case 3://bottom right
                clockPosX = scaledWidth - 38;
                clockPosY = scaledHeight-8;
                clockAdj = -12;
                break;
        }

        if (doAmPm && !military) {//positioning changes if there is AMPM on the end or not.
            textRenderer.drawWithShadow(matrixStack, String.format("%02d", localHour) + ":" + String.format("%02d", localMinute)+amPm, clockPosX, clockPosY, 16777215);
        } else {
            textRenderer.drawWithShadow(matrixStack, String.format("%02d", localHour) + ":" + String.format("%02d", localMinute), clockPosX-clockAdj, clockPosY, 16777215);
        }
    }
}