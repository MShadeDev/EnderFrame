package eu.mshade.enderframe.protocol.temp.listener;

import eu.mshade.enderframe.EnderFrame;
import eu.mshade.enderframe.event.server.ServerStatusEvent;
import eu.mshade.enderframe.protocol.temp.packet.PacketInStatus;
import eu.mshade.mwork.event.EventContainer;
import eu.mshade.mwork.event.EventListener;

public class PacketStatusListener implements EventListener<PacketInStatus> {
    @Override
    public void onEvent(PacketInStatus event, EventContainer eventContainer) {
        EnderFrame.get().getPacketEventBus().publish(new ServerStatusEvent(), eventContainer);
    }

    /*
    @Override
    public void handle(PacketInStatus packetInStatus, DispatcherContainer dispatcherContainer) {
        EnderFrame.get().getPacketEventBus().dispatch(new ServerStatusEvent(), dispatcherContainer);
    }

     */

}