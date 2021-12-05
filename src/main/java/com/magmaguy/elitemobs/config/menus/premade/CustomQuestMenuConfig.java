package com.magmaguy.elitemobs.config.menus.premade;

import com.magmaguy.elitemobs.ChatColorConverter;
import com.magmaguy.elitemobs.config.ConfigurationEngine;
import com.magmaguy.elitemobs.config.EconomySettingsConfig;
import com.magmaguy.elitemobs.config.menus.MenusConfigFields;
import com.magmaguy.elitemobs.quests.objectives.KillObjective;
import com.magmaguy.elitemobs.quests.objectives.Objective;
import com.magmaguy.elitemobs.quests.rewards.QuestReward;
import com.magmaguy.elitemobs.quests.rewards.RewardEntry;
import lombok.Getter;
import net.md_5.bungee.api.chat.TextComponent;
import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CustomQuestMenuConfig extends MenusConfigFields {
    public static String headerTextLines;
    public static String acceptTextLines, acceptHoverLines, acceptCommandLines;
    public static String acceptedTextLines, acceptedHoverLines, acceptedCommandLines;
    public static String completedTextLines, completedHoverLines, completedCommandLines;
    @Getter
    private static String turnedInTextLines, turnedInHoverLines;
    public static String ongoingColorCode, completedColorCode;
    public static String objectivesLine;
    public static String rewardsLine;
    private static String killQuestDefaultSummaryLine, fetchQuestDefaultSummaryLine;
    private static String rewardsDefaultSummaryLine;

    public CustomQuestMenuConfig() {
        super("custom_quest_screen", true);
    }

    public static String getKillQuestDefaultSummaryLine(Objective objective) {
        String newString = killQuestDefaultSummaryLine;
        newString = newString.replace("$name", ChatColor.BLACK + ChatColor.stripColor(((KillObjective) objective).getObjectiveName()));
        newString = newString.replace("$current", ((KillObjective) objective).getCurrentAmount() + "");
        newString = newString.replace("$target", ((KillObjective) objective).getTargetAmount() + "");
        if (!objective.isObjectiveCompleted())
            return newString.replace("$color", ongoingColorCode);
        else
            return newString.replace("$color", completedColorCode);
    }

    public static TextComponent getRewardsDefaultSummaryLine(QuestReward questReward, int questLevel, Player player) {
        TextComponent textComponent = new TextComponent();
        for (RewardEntry rewardEntry : questReward.getRewardEntries())
            if (rewardEntry.getItemStack() != null) {
                textComponent.addExtra(rewardsDefaultSummaryLine
                        .replace("$amount", rewardEntry.getAmount() + "")
                        .replace("$rewardName", WordUtils.capitalizeFully(rewardEntry.getItemStack().getType().toString()).replace("_", " "))
                        .replace("$chance", (int) (rewardEntry.getChance() * 100) + ""));
                textComponent.addExtra("\n");
            } else if (rewardEntry.getCurrencyAmount() != 0) {
                TextComponent customItemTextComponent = new TextComponent(rewardsDefaultSummaryLine
                        .replace("$amount", rewardEntry.getAmount() + "")
                        .replace("$rewardName", rewardEntry.getCurrencyAmount() + " " + EconomySettingsConfig.currencyName)
                        .replace("$chance", (int) (rewardEntry.getChance() * 100) + ""));
                textComponent.addExtra(customItemTextComponent);
                textComponent.addExtra("\n");
            }
        return textComponent;
    }


    @Override
    public void processAdditionalFields() {
        headerTextLines = ConfigurationEngine.setString(fileConfiguration, "headerTextLines",
                ChatColorConverter.convert("&0&m⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯\n&c&l$questName\n&0&m⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯\n"));

        acceptTextLines = ConfigurationEngine.setString(fileConfiguration, "acceptTextLines", "&a&lAccept!");
        acceptHoverLines = ConfigurationEngine.setString(fileConfiguration, "acceptHoverLines", "&aClick to \n&aaccept quest!");
        acceptCommandLines = ConfigurationEngine.setString(fileConfiguration, "acceptCommandLines", "/em quest accept $questID");

        acceptedTextLines = ConfigurationEngine.setString(fileConfiguration, "acceptedTextLines", "&2&lAccepted! &4[Abandon]");
        acceptedHoverLines = ConfigurationEngine.setString(fileConfiguration, "acceptedHoverLines", "&aClick to abandon quest!");
        acceptedCommandLines = ConfigurationEngine.setString(fileConfiguration, "acceptedCommandLines3", "/em quest leave $questID");

        completedTextLines = ConfigurationEngine.setString(fileConfiguration, "completedTextLines", "&2&l[Turn in!]");
        completedHoverLines = ConfigurationEngine.setString(fileConfiguration, "completedHoverLines", "&aClick to turn quest in!");
        completedCommandLines = ConfigurationEngine.setString(fileConfiguration, "completedCommandLines", "/em quest complete $questID");

        turnedInTextLines = ConfigurationEngine.setString(fileConfiguration, "turnedInTextLines", "&8[Completed!]");
        turnedInHoverLines = ConfigurationEngine.setString(fileConfiguration, "turnedInHoverLines", "&8Already turned in!");

        objectivesLine = ConfigurationEngine.setString(fileConfiguration, "objectivesLine", "&c&lObjectives:");
        killQuestDefaultSummaryLine = ConfigurationEngine.setString(fileConfiguration, "killQuestDefaultSummaryLine", "&c➤Kill $name:$color$current&0/$color$target");
        fetchQuestDefaultSummaryLine = ConfigurationEngine.setString(fileConfiguration, "fetchQuestDefaultSummaryLine", "&c➤Get $name:$color&$current&0/$color$target");

        rewardsLine = ConfigurationEngine.setString(fileConfiguration, "rewardsLine", "&2&lRewards:");
        rewardsDefaultSummaryLine = ConfigurationEngine.setString(fileConfiguration, "rewardsDefaultSummaryLine", "&2➤$amountx $rewardName &8($chance%)");

        ongoingColorCode = ConfigurationEngine.setString(fileConfiguration, "ongoingQuestColorCode", "&c");
        completedColorCode = ConfigurationEngine.setString(fileConfiguration, "ongoingQuestColorCode", "&2");

    }

}
