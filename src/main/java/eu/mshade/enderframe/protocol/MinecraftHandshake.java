package eu.mshade.enderframe.protocol;

import java.net.InetSocketAddress;

public class MinecraftHandshake {

    private MinecraftProtocolVersion version;
    private InetSocketAddress inetSocketAddress;
    private HandshakeStatus handshakeStatus;

    public MinecraftHandshake(MinecraftProtocolVersion version, InetSocketAddress inetSocketAddress, HandshakeStatus handshakeStatus) {
        this.version = version;
        this.inetSocketAddress = inetSocketAddress;
        this.handshakeStatus = handshakeStatus;
    }

    public MinecraftProtocolVersion getVersion() {
        return version;
    }

    public InetSocketAddress getInetSocketAddress() {
        return inetSocketAddress;
    }

    public HandshakeStatus getHandshakeStatus() {
        return handshakeStatus;
    }

    @Override
    public String toString() {
        return "Handshake{" +
                "version=" + version +
                ", inetSocketAddress=" + inetSocketAddress +
                ", handshakeStatus=" + handshakeStatus +
                '}';
    }
}