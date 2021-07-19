package eu.mshade.enderframe.protocol.temp.listener;

import eu.mshade.enderframe.EnderFrame;
import eu.mshade.enderframe.event.entity.PacketHandshakeEvent;
import eu.mshade.enderframe.protocol.Handshake;
import eu.mshade.enderframe.protocol.temp.packet.PacketInHandshake;
import eu.mshade.mwork.event.EventContainer;
import eu.mshade.mwork.event.EventListener;

import java.net.InetSocketAddress;

public class PacketHandshakeListener implements EventListener<PacketInHandshake> {

    @Override
    public void onEvent(PacketInHandshake event, EventContainer eventContainer) {
        Handshake handshake = new Handshake(event.getVersion(), InetSocketAddress.createUnresolved(event.getHost(), event.getPort()), event.getHandshakeStatus());
        EnderFrame.get().getPacketEventBus().publish(new PacketHandshakeEvent(handshake), eventContainer);
    }


    /*
    @Override
    public void handle(PacketInHandshake packet, DispatcherContainer dispatcherContainer) {
        Handshake handshake = new Handshake(packet.getVersion(), InetSocketAddress.createUnresolved(packet.getHost(), packet.getPort()), packet.getHandshakeStatus());
        EnderFrame.get().getPacketEventBus().dispatch(new PacketHandshakeEvent(handshake), dispatcherContainer);
    }

     */

}