package eu.mshade.enderframe.item.metadata

import eu.mshade.enderframe.item.ItemStackMetadataKey
import eu.mshade.enderframe.metadata.MetadataKeyValue
import eu.mshade.enderframe.mojang.GameProfile

class SkullOwnerItemStackMetadata(metadataValue: GameProfile) :
    MetadataKeyValue<GameProfile>(ItemStackMetadataKey.SKULL_OWNER, metadataValue)
