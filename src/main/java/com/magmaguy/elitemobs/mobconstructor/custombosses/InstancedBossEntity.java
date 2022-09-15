package com.magmaguy.elitemobs.mobconstructor.custombosses;

import com.google.common.collect.ArrayListMultimap;
import com.magmaguy.elitemobs.config.custombosses.CustomBossesConfigFields;
import com.magmaguy.elitemobs.mobconstructor.PersistentMovingEntity;
import com.magmaguy.elitemobs.mobconstructor.PersistentObject;
import com.magmaguy.elitemobs.utils.ConfigurationLocation;
import com.magmaguy.elitemobs.utils.WarningMessage;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;

public class InstancedBossEntity extends RegionalBossEntity implements PersistentObject, PersistentMovingEntity {
    private static final ArrayListMultimap<String, InstancedBossContainer> instancedBossEntities = ArrayListMultimap.create();

    public InstancedBossEntity(CustomBossesConfigFields customBossesConfigFields, Location location) {
        super(customBossesConfigFields, location, false, true);
    }

    public static void shutdown() {
        instancedBossEntities.clear();
    }

    public static void add(String stringLocation, CustomBossesConfigFields customBossesConfigFields) {
        String blueprintWorldName = stringLocation.split(",")[0];
        if (blueprintWorldName == null || blueprintWorldName.isEmpty()) {
            new WarningMessage("Failed to get blueprint world location for custom boss " + customBossesConfigFields.getFilename() + " !");
            return;
        }
        instancedBossEntities.put(blueprintWorldName, new InstancedBossContainer(ConfigurationLocation.serialize(stringLocation, true), customBossesConfigFields));
    }

    public static List<InstancedBossEntity> initializeInstancedBosses(String blueprintWorldName, World newWorld) {
        List<InstancedBossEntity> newDungeonList = new ArrayList<>();
        List<InstancedBossContainer> rawBosses = instancedBossEntities.get(blueprintWorldName);
        for (InstancedBossContainer containers : rawBosses) {
            Location newLocation = containers.getLocation().clone();
            newLocation.setWorld(newWorld);
            InstancedBossEntity newEntity = new InstancedBossEntity(containers.getCustomBossesConfigFields(), newLocation);
            newEntity.spawn(false);
            newDungeonList.add(newEntity);
        }
        return newDungeonList;
    }

    private static class InstancedBossContainer {
        @Getter
        private final Location location;
        @Getter
        private final CustomBossesConfigFields customBossesConfigFields;

        public InstancedBossContainer(Location location, CustomBossesConfigFields customBossesConfigFields) {
            this.location = location;
            this.customBossesConfigFields = customBossesConfigFields;
        }
    }
}
