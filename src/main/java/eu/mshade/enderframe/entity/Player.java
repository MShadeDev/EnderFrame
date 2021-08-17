package eu.mshade.enderframe.entity;

import eu.mshade.enderframe.EnderFrameSessionHandler;
import eu.mshade.enderframe.GameMode;
import eu.mshade.enderframe.mojang.GameProfile;
import eu.mshade.enderframe.mojang.SkinParts;
import eu.mshade.enderframe.protocol.ProtocolVersion;
import eu.mshade.enderframe.world.Location;
import eu.mshade.enderframe.world.Vector;
import eu.mshade.mwork.MOptional;

import java.net.SocketAddress;
import java.util.UUID;

public abstract class Player extends LivingEntity implements ProjectileSource {

    private final EnderFrameSessionHandler enderFrameSessionHandler;
    private final String name;
    private final SocketAddress socketAddress;
    private final ProtocolVersion protocolVersion;
    private final int ping;
    private final SkinParts skinParts;
    private final boolean unused;
    private final float absorptionHearts;
    private final int score;
    private MOptional<String> displayName;
    private GameMode gameMode;
    private GameProfile gameProfile;

    public Player(Location location, Vector velocity, int entityId, boolean isFire, boolean isSneaking, boolean isSprinting, boolean isEating, boolean isInvisible, short airTicks, String customName, boolean isCustomNameVisible, boolean isSilent, UUID uuid, float health, int potionEffectColor, boolean isPotionEffectAmbient, byte numberOfArrowInEntity, boolean isAIDisable, EnderFrameSessionHandler enderFrameSessionHandler, String name, SocketAddress socketAddress, ProtocolVersion protocolVersion, int ping, SkinParts skinParts, boolean unused, float absorptionHearts, int score, MOptional<String> displayName, GameMode gameMode, GameProfile gameProfile) {
        super(location, velocity, entityId, isFire, isSneaking, isSprinting, isEating, isInvisible, airTicks, customName, isCustomNameVisible, isSilent, uuid, EntityType.PLAYER, health, potionEffectColor, isPotionEffectAmbient, numberOfArrowInEntity, isAIDisable);
        this.enderFrameSessionHandler = enderFrameSessionHandler;
        this.name = name;
        this.socketAddress = socketAddress;
        this.protocolVersion = protocolVersion;
        this.ping = ping;
        this.skinParts = skinParts;
        this.unused = unused;
        this.absorptionHearts = absorptionHearts;
        this.score = score;
        this.displayName = displayName;
        this.gameMode = gameMode;
        this.gameProfile = gameProfile;
    }

    public Player(Location location, int entityId, EnderFrameSessionHandler enderFrameSessionHandler, String name, SocketAddress socketAddress, ProtocolVersion protocolVersion, GameMode gameMode, GameProfile gameProfile) {
        super(location, EntityType.PLAYER, entityId, 20f);
        this.enderFrameSessionHandler = enderFrameSessionHandler;
        this.name = name;
        this.socketAddress = socketAddress;
        this.protocolVersion = protocolVersion;
        this.ping = 0;
        this.skinParts = SkinParts.fromByte((byte)127);
        this.unused = false;
        this.absorptionHearts = 0f;
        this.score = 0;
        this.displayName = MOptional.empty();
        this.gameMode = gameMode;
        this.gameProfile = gameProfile;
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
        return null;
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector vector) {
        return null;
    }

    public EnderFrameSessionHandler getEnderFrameSessionHandler() {
        return enderFrameSessionHandler;
    }

    public String getName() {
        return name;
    }

    public SocketAddress getSocketAddress() {
        return socketAddress;
    }

    public ProtocolVersion getProtocolVersion() {
        return protocolVersion;
    }

    public int getPing() {
        return ping;
    }

    public SkinParts getSkinParts() {
        return skinParts;
    }

    public boolean isUnused() {
        return unused;
    }

    public float getAbsorptionHearts() {
        return absorptionHearts;
    }

    public int getScore() {
        return score;
    }

    public MOptional<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(MOptional<String> displayName) {
        this.displayName = displayName;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public GameProfile getGameProfile() {
        return gameProfile;
    }

    public void setGameProfile(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
    }
}
