package com.dillo.Pathfinding.baritone.automine.events;

import net.minecraft.network.Packet;
import net.minecraftforge.fml.common.eventhandler.Event;

public class ReceivePacketEvent extends Event {

  public Packet<?> packet;

  public ReceivePacketEvent(Packet<?> packet) {
    this.packet = packet;
  }
}
