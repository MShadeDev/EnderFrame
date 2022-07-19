package eu.mshade.enderframe.world.metadata;

import eu.mshade.enderframe.metadata.MetadataKeyValue;
import eu.mshade.enderframe.metadata.world.WorldMetadataType;
import eu.mshade.enderframe.world.Difficulty;

public class DifficultyWorldMetadata extends MetadataKeyValue<Difficulty> {

    public DifficultyWorldMetadata(Difficulty metadataValue) {
        super(WorldMetadataType.DIFFICULTY, metadataValue);
    }
}