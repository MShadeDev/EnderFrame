package eu.mshade.enderframe.event;

import eu.mshade.enderframe.entity.Player;
import eu.mshade.enderframe.world.ChunkBuffer;

public class ChunkLoadEvent implements EnderFrameEvent {

    private final ChunkBuffer chunkBuffer;
    private final Player player;

    public ChunkLoadEvent(ChunkBuffer chunkBuffer, Player player) {
        this.chunkBuffer = chunkBuffer;
        this.player = player;
    }

    public ChunkBuffer getChunkBuffer() {
        return chunkBuffer;
    }

    public Player getPlayer() {
        return player;
    }
}
