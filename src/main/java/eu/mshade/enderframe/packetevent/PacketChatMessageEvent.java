package eu.mshade.enderframe.packetevent;

import eu.mshade.enderframe.entity.Player;

public class PacketChatMessageEvent implements PacketEvent {

    private final Player player;
    private final String message;

    public PacketChatMessageEvent(Player player, String message) {
        this.player = player;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Player getPlayer() { return player; }

}