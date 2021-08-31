
package eu.mshade.enderframe;

import eu.mshade.enderframe.event.EnderFrameEvent;
import eu.mshade.enderframe.packetevent.PacketEvent;
import eu.mshade.mwork.event.EventBus;

public class EnderFrame {

    private final EventBus<PacketEvent> packetEventBus = new EventBus<>();
    private final EventBus<EnderFrameEvent> enderFrameEventBus = new EventBus<>();
    private static EnderFrame ENDER_FRAME;

    private EnderFrame() {
        ENDER_FRAME = this;
    }

    public EventBus<PacketEvent> getPacketEventBus() {
        return packetEventBus;
    }

    public EventBus<EnderFrameEvent> getEnderFrameEventBus() {
        return enderFrameEventBus;
    }

    public static EnderFrame get(){
        return (ENDER_FRAME != null ? ENDER_FRAME : new EnderFrame());
    }
}