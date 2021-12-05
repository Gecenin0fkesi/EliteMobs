package com.magmaguy.elitemobs.commands.quests;

import com.magmaguy.elitemobs.quests.CustomQuest;
import com.magmaguy.elitemobs.quests.Quest;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.UUID;

public class QuestCommand {

    public static void completeQuest(String questID, Player player) {
        try {
            CustomQuest.completeQuest(UUID.fromString(questID), player);
        } catch (Exception ex) {
            player.sendMessage(ChatColor.RED + "[EliteMobs] Invalid quest ID!");
        }
    }

    // /em quest join questFilename
    public static void joinQuest(String questID, Player player) {
        CustomQuest.startQuest(questID, player);
    }

    // /em quest leave questFilename
    public static void leaveQuest(Player player, String questID) {
        Quest.stopPlayerQuest(player, questID);
    }

}
