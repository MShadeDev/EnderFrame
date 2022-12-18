package eu.mshade.enderframe.entity;

import eu.mshade.enderframe.world.Location;
import eu.mshade.enderframe.world.Vector;

import java.util.UUID;

public abstract class Snowman extends LivingEntity {


    public Snowman(Location location, Vector velocity, int entityId, UUID uuid) {
        super(location, velocity, entityId, uuid, EntityType.SNOWMAN);
    }

    public Snowman(Location location, int entityId) {
        super(location, entityId, EntityType.SNOWMAN);
    }
}