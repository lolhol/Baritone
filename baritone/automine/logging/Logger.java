package com.dillo.Pathfinding.baritone.automine.logging;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import org.apache.logging.log4j.LogManager;

public class Logger {

  // POV : You think this is a token logger
  public static void log(String msg) {
    LogManager.getLogger("autogg").info(msg);
  }

  public static void playerLog(String msg) {
    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("[Baritone] : " + msg));
  }
}
