package com.magmaguy.elitemobs.config.customarenas.premade;

import com.magmaguy.elitemobs.config.customarenas.CustomArenasConfigFields;

import java.util.ArrayList;
import java.util.Arrays;

public class WoodLeagueArena extends CustomArenasConfigFields {
    public WoodLeagueArena() {
        super("wood_league", true);
        super.setArenaName("Wood League");
        super.setCorner1("em_adventurers_guild,257,69,333,0,0");
        super.setCorner2("em_adventurers_guild,181,91,257,0,0");
        super.setStartLocation("em_adventurers_guild,219.5,70,295.5,0,0");
        super.setExitLocation("em_adventurers_guild,245.5,92,274.5,0,0");
        super.setWaveCount(30);
        super.setBossList(Arrays.asList(
                "wave=1:spawnPoint=north:boss=wood_league_wave_1_melee.yml",
                "wave=1:spawnPoint=north:boss=wood_league_wave_1_melee.yml",
                "wave=1:spawnPoint=north:boss=wood_league_wave_1_ranged.yml",

                "wave=2:spawnPoint=north:boss=wood_league_wave_2_melee.yml",
                "wave=2:spawnPoint=north:boss=wood_league_wave_2_melee.yml",
                "wave=2:spawnPoint=north:boss=wood_league_wave_2_ranged.yml",
                "wave=2:spawnPoint=south:boss=wood_league_wave_2_melee.yml",
                "wave=2:spawnPoint=south:boss=wood_league_wave_2_melee.yml",
                "wave=2:spawnPoint=south:boss=wood_league_wave_2_ranged.yml",

                "wave=3:spawnPoint=north:boss=wood_league_wave_3_melee.yml",
                "wave=3:spawnPoint=north:boss=wood_league_wave_3_melee.yml",
                "wave=3:spawnPoint=north:boss=wood_league_wave_3_ranged.yml",
                "wave=3:spawnPoint=south:boss=wood_league_wave_3_melee.yml",
                "wave=3:spawnPoint=south:boss=wood_league_wave_3_melee.yml",
                "wave=3:spawnPoint=south:boss=wood_league_wave_3_ranged.yml",

                "wave=4:spawnPoint=north:boss=wood_league_wave_4_melee.yml",
                "wave=4:spawnPoint=north:boss=wood_league_wave_4_melee.yml",
                "wave=4:spawnPoint=north:boss=wood_league_wave_4_ranged.yml",
                "wave=4:spawnPoint=south:boss=wood_league_wave_4_melee.yml",
                "wave=4:spawnPoint=south:boss=wood_league_wave_4_melee.yml",
                "wave=4:spawnPoint=south:boss=wood_league_wave_4_ranged.yml",

                "wave=5:spawnPoint=center:boss=wood_league_wave_5_miniboss.yml",

                "wave=6:spawnPoint=north:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=north:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=north:boss=wood_league_wave_6_ranged.yml",
                "wave=6:spawnPoint=south:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=south:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=south:boss=wood_league_wave_6_ranged.yml",
                "wave=6:spawnPoint=east:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=east:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=east:boss=wood_league_wave_6_ranged.yml",
                "wave=6:spawnPoint=west:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=west:boss=wood_league_wave_6_melee.yml",
                "wave=6:spawnPoint=west:boss=wood_league_wave_6_ranged.yml",

                "wave=7:spawnPoint=north:boss=wood_league_wave_7_melee.yml",
                "wave=7:spawnPoint=north:boss=wood_league_wave_7_melee.yml",
                "wave=7:spawnPoint=north:boss=wood_league_wave_7_ranged.yml",
                "wave=7:spawnPoint=south:boss=wood_league_wave_7_melee.yml",
                "wave=7:spawnPoint=south:boss=wood_league_wave_7_melee.yml",
                "wave=7:spawnPoint=south:boss=wood_league_wave_7_ranged.yml",

                "wave=8:spawnPoint=north:boss=wood_league_wave_8_melee.yml",
                "wave=8:spawnPoint=north:boss=wood_league_wave_8_melee.yml",
                "wave=8:spawnPoint=north:boss=wood_league_wave_8_melee.yml",
                "wave=8:spawnPoint=south:boss=wood_league_wave_8_melee.yml",
                "wave=8:spawnPoint=south:boss=wood_league_wave_8_melee.yml",
                "wave=8:spawnPoint=south:boss=wood_league_wave_8_melee.yml",

                "wave=9:spawnPoint=north:boss=wood_league_wave_9_ranged.yml",
                "wave=9:spawnPoint=north:boss=wood_league_wave_9_ranged.yml",
                "wave=9:spawnPoint=north:boss=wood_league_wave_9_ranged.yml",
                "wave=9:spawnPoint=south:boss=wood_league_wave_9_ranged.yml",
                "wave=9:spawnPoint=south:boss=wood_league_wave_9_ranged.yml",
                "wave=9:spawnPoint=south:boss=wood_league_wave_9_ranged.yml",

                "wave=10:spawnPoint=center:boss=wood_league_wave_10_boss.yml",

                "wave=11:spawnPoint=north:boss=wood_league_wave_11_melee.yml",
                "wave=11:spawnPoint=north:boss=wood_league_wave_11_melee.yml",
                "wave=11:spawnPoint=north:boss=wood_league_wave_11_ranged.yml",
                "wave=11:spawnPoint=south:boss=wood_league_wave_11_melee.yml",
                "wave=11:spawnPoint=south:boss=wood_league_wave_11_melee.yml",
                "wave=11:spawnPoint=south:boss=wood_league_wave_11_ranged.yml",

                "wave=12:spawnPoint=north:boss=wood_league_wave_12_melee.yml",
                "wave=12:spawnPoint=north:boss=wood_league_wave_12_melee.yml",
                "wave=12:spawnPoint=north:boss=wood_league_wave_12_ranged.yml",
                "wave=12:spawnPoint=south:boss=wood_league_wave_12_melee.yml",
                "wave=12:spawnPoint=south:boss=wood_league_wave_12_melee.yml",
                "wave=12:spawnPoint=south:boss=wood_league_wave_12_ranged.yml",
                "wave=12:spawnPoint=east:boss=wood_league_wave_12_melee.yml",
                "wave=12:spawnPoint=east:boss=wood_league_wave_12_melee.yml",
                "wave=12:spawnPoint=east:boss=wood_league_wave_12_ranged.yml",

                "wave=13:spawnPoint=north:boss=wood_league_wave_13_melee.yml",
                "wave=13:spawnPoint=north:boss=wood_league_wave_13_melee.yml",
                "wave=13:spawnPoint=north:boss=wood_league_wave_13_ranged.yml",
                "wave=13:spawnPoint=south:boss=wood_league_wave_13_melee.yml",
                "wave=13:spawnPoint=south:boss=wood_league_wave_13_melee.yml",
                "wave=13:spawnPoint=south:boss=wood_league_wave_13_ranged.yml",
                "wave=13:spawnPoint=east:boss=wood_league_wave_13_melee.yml",
                "wave=13:spawnPoint=east:boss=wood_league_wave_13_melee.yml",
                "wave=13:spawnPoint=east:boss=wood_league_wave_13_ranged.yml",

                "wave=14:spawnPoint=north:boss=wood_league_wave_14_melee.yml",
                "wave=14:spawnPoint=north:boss=wood_league_wave_14_melee.yml",
                "wave=14:spawnPoint=north:boss=wood_league_wave_14_ranged.yml",
                "wave=14:spawnPoint=south:boss=wood_league_wave_14_melee.yml",
                "wave=14:spawnPoint=south:boss=wood_league_wave_14_melee.yml",
                "wave=14:spawnPoint=south:boss=wood_league_wave_14_ranged.yml",
                "wave=14:spawnPoint=east:boss=wood_league_wave_14_melee.yml",
                "wave=14:spawnPoint=east:boss=wood_league_wave_14_melee.yml",
                "wave=14:spawnPoint=east:boss=wood_league_wave_14_ranged.yml",

                "wave=15:spawnPoint=center:boss=wood_league_wave_15_boss.yml",

                "wave=16:spawnPoint=north:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=north:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=north:boss=wood_league_wave_16_ranged.yml",
                "wave=16:spawnPoint=south:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=south:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=south:boss=wood_league_wave_16_ranged.yml",
                "wave=16:spawnPoint=east:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=east:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=east:boss=wood_league_wave_16_ranged.yml",
                "wave=16:spawnPoint=west:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=west:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=west:boss=wood_league_wave_16_ranged.yml",
                "wave=16:spawnPoint=northeast:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=northeast:boss=wood_league_wave_16_melee.yml",
                "wave=16:spawnPoint=northeast:boss=wood_league_wave_16_ranged.yml",

                "wave=17:spawnPoint=north:boss=wood_league_wave_17_melee.yml",
                "wave=17:spawnPoint=north:boss=wood_league_wave_17_melee.yml",
                "wave=17:spawnPoint=north:boss=wood_league_wave_17_ranged.yml",
                "wave=17:spawnPoint=south:boss=wood_league_wave_17_melee.yml",
                "wave=17:spawnPoint=south:boss=wood_league_wave_17_melee.yml",
                "wave=17:spawnPoint=south:boss=wood_league_wave_17_ranged.yml",
                "wave=17:spawnPoint=east:boss=wood_league_wave_17_melee.yml",
                "wave=17:spawnPoint=east:boss=wood_league_wave_17_melee.yml",
                "wave=17:spawnPoint=east:boss=wood_league_wave_17_ranged.yml",

                "wave=18:spawnPoint=north:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=north:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=north:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=south:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=south:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=south:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=east:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=east:boss=wood_league_wave_18_melee.yml",
                "wave=18:spawnPoint=east:boss=wood_league_wave_18_melee.yml",

                "wave=19:spawnPoint=north:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=north:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=north:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=south:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=south:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=south:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=east:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=east:boss=wood_league_wave_19_ranged.yml",
                "wave=19:spawnPoint=east:boss=wood_league_wave_19_ranged.yml",

                "wave=20:spawnPoint=center:boss=wood_league_wave_20_boss.yml",

                "wave=21:spawnPoint=north:boss=wood_league_wave_21_melee.yml",
                "wave=21:spawnPoint=north:boss=wood_league_wave_21_melee.yml",
                "wave=21:spawnPoint=north:boss=wood_league_wave_21_ranged.yml",
                "wave=21:spawnPoint=south:boss=wood_league_wave_21_melee.yml",
                "wave=21:spawnPoint=south:boss=wood_league_wave_21_melee.yml",
                "wave=21:spawnPoint=south:boss=wood_league_wave_21_ranged.yml",
                "wave=21:spawnPoint=east:boss=wood_league_wave_21_melee.yml",
                "wave=21:spawnPoint=east:boss=wood_league_wave_21_melee.yml",
                "wave=21:spawnPoint=east:boss=wood_league_wave_21_ranged.yml",

                "wave=22:spawnPoint=north:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=north:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=north:boss=wood_league_wave_22_ranged.yml",
                "wave=22:spawnPoint=south:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=south:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=south:boss=wood_league_wave_22_ranged.yml",
                "wave=22:spawnPoint=east:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=east:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=east:boss=wood_league_wave_22_ranged.yml",
                "wave=22:spawnPoint=west:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=west:boss=wood_league_wave_22_melee.yml",
                "wave=22:spawnPoint=west:boss=wood_league_wave_22_ranged.yml",

                "wave=23:spawnPoint=north:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=north:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=north:boss=wood_league_wave_23_ranged.yml",
                "wave=23:spawnPoint=south:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=south:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=south:boss=wood_league_wave_23_ranged.yml",
                "wave=23:spawnPoint=east:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=east:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=east:boss=wood_league_wave_23_ranged.yml",
                "wave=23:spawnPoint=west:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=west:boss=wood_league_wave_23_melee.yml",
                "wave=23:spawnPoint=west:boss=wood_league_wave_23_ranged.yml",

                "wave=24:spawnPoint=north:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=north:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=north:boss=wood_league_wave_24_ranged.yml",
                "wave=24:spawnPoint=south:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=south:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=south:boss=wood_league_wave_24_ranged.yml",
                "wave=24:spawnPoint=east:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=east:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=east:boss=wood_league_wave_24_ranged.yml",
                "wave=24:spawnPoint=west:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=west:boss=wood_league_wave_24_melee.yml",
                "wave=24:spawnPoint=west:boss=wood_league_wave_24_ranged.yml",

                "wave=25:spawnPoint=center:boss=wood_league_wave_25_miniboss.yml",

                "wave=26:spawnPoint=north:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=north:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=north:boss=wood_league_wave_26_ranged.yml",
                "wave=26:spawnPoint=south:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=south:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=south:boss=wood_league_wave_26_ranged.yml",
                "wave=26:spawnPoint=east:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=east:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=east:boss=wood_league_wave_26_ranged.yml",
                "wave=26:spawnPoint=west:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=west:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=west:boss=wood_league_wave_26_ranged.yml",
                "wave=26:spawnPoint=northeast:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=northeast:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=northeast:boss=wood_league_wave_26_ranged.yml",
                "wave=26:spawnPoint=southwest:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=southwest:boss=wood_league_wave_26_melee.yml",
                "wave=26:spawnPoint=southwest:boss=wood_league_wave_26_ranged.yml",

                "wave=27:spawnPoint=north:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=north:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=north:boss=wood_league_wave_27_ranged.yml",
                "wave=27:spawnPoint=south:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=south:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=south:boss=wood_league_wave_27_ranged.yml",
                "wave=27:spawnPoint=east:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=east:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=east:boss=wood_league_wave_27_ranged.yml",
                "wave=27:spawnPoint=west:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=west:boss=wood_league_wave_27_melee.yml",
                "wave=27:spawnPoint=west:boss=wood_league_wave_27_ranged.yml",

                "wave=28:spawnPoint=north:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=north:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=north:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=south:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=south:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=south:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=east:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=east:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=east:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=west:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=west:boss=wood_league_wave_28_melee.yml",
                "wave=28:spawnPoint=west:boss=wood_league_wave_28_melee.yml",

                "wave=29:spawnPoint=north:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=north:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=north:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=south:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=south:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=south:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=east:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=east:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=east:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=west:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=west:boss=wood_league_wave_29_ranged.yml",
                "wave=29:spawnPoint=west:boss=wood_league_wave_29_ranged.yml",

                "wave=30:spawnPoint=center:boss=wood_league_wave_30_boss.yml"

                ));
        super.setSpawnPoints(Arrays.asList(
                "name=north:location=em_adventurers_guild,219.5,71,273.5",
                "name=south:location=em_adventurers_guild,219.5,71,316.5",
                "name=west:location=em_adventurers_guild,197.5,71,295.5",
                "name=east:location=em_adventurers_guild,240.5,71,295.5",
                "name=center:location=em_adventurers_guild,219.5,71,295.5",
                "name=northeast:location=em_adventurers_guild,233.5,71,281.5",
                "name=southeast:location=em_adventurers_guild,233.5,71,309.5",
                "name=northwest:location=em_adventurers_guild,205.5,71,281.5",
                "name=southwest:location=em_adventurers_guild,205.5,71,309.5"));

        super.setDelayBetweenWaves(5);
        super.setRawArenaRewards(Arrays.asList(
                "wave=10:level=10:filename=summon_merchant_scroll.yml"
        ));
        super.setArenaMessages(new ArrayList<>(Arrays.asList(
                "wave=1:message=&8[Gladius] &fToday's main event! A legendary fighter came all the way to the arena to test his might against the toughest monsters from all the land! But before that, here's a rookie fighting some zombies.",
                "wave=2:message=&8[Gladius] &fWould you look at that, they at least know how to wave their arms! That was just the warmup, let's start putting on some pressure!",
                "wave=3:message=&8[Gladius] &fSo you think you know how to fight? Well this wave will put the &cheat &fon! Ha ha ha ha ha!",
                "wave=4:message=&8[Gladius] &fAlright I guess they can take the heat! Ladies and gentlemen, strap on, we might be in for a show!",
                "wave=5:message=&8[Gladius] &fI found this &cweird creature &foutside, and I thought putting it in the arena would be funny!",
                "wave=6:message=&8[Gladius] &fSeems like you can handle small groups of enemies just fine, &clet's try scaling that up!",
                "wave=7:message=&8[Gladius] &fSo you think you can truly challenge the arena? We shall see...",
                "wave=8:message=&8[Gladius] &fNot bad, but what if every enemy is a &cmelee &fenemy?",
                "wave=9:message=&8[Gladius] &fNice, nice, but what if they're all &cranged &finstead?",
                "wave=10:message=&8[Gladius] &fCareful now, a &cbad doggo &fseems to have wandered into the arena! Where did it even come from?",
                "wave=11:message=&8[Gladius] &fAlright folks we got animal control to deal with the bad doggos, we're back in business!",
                "wave=12:message=&8[Gladius] &fIt seems like the audience is clamoring for &cmore&f! Well, let's give it to them!",
                "wave=13:message=&8[Gladius] &fSeems like the custodians got bored and gave the arena creatures &2poison&f! Let's see where this goes...",
                "wave=14:message=&8[Gladius] &fWell that was... boring! Whoever gave those guys poison is fired! Come up with something better next time!",
                "wave=15:message=&8[Gladius] &fAnd here we have this year's prize-winning &4hog&f! It got first place for ugliness and meanness! Everyone give a round of applause for &4Mr. Oinkers&f!",
                "wave=16:message=&8[Gladius] &fMr. Oinkers is now bacon! Here comes &cMr. Oinker's fans&f, flooding the arena to get their revenge!",
                "wave=17:message=&8[Gladius] &fIt would seem as though our arena challenger thinks they have a shot! But can they deal with even more &cpowerful &ffoes?",
                "wave=18:message=&8[Gladius] &fThe &cfencing club &fand the &carchery club &fare having a contest! Let's see which one does better!",
                "wave=19:message=&8[Gladius] &fThe fencing club didn't so so hot, let's see what the &carchery club&f has for us!",
                "wave=20:message=&8[Gladius] &fSeems like the archery club didn't do so hot either! It seems like our challenger has begun attracting the attention of some of our top gladiators! Introducing &2Zoltan, the Pride of the Zombies&f!",
                "wave=21:message=&8[Gladius] &fUnbelievable! Seems like this rookie defeated Zoltan! Do we have a potential new champion in our hands?",
                "wave=22:message=&8[Gladius] &fSpectators are starting to place their bets? How far can today's contestant go?",
                "wave=23:message=&8[Gladius] &fDon't look away now, this wave's enemies all have withering attack!",
                "wave=24:message=&8[Gladius] &fSeems like some pretty big arena names are starting to arrive to stop this challenger! Stay tuned!",
                "wave=25:message=&8[Gladius] &fHere comes &bAgdluak&f, the archer from the Great North! Beware of its &bfrost&f!",
                "wave=26:message=&8[Gladius] &fThat was a pretty cool fight! I am &cswarming &fwith excitement to see what's next!",
                "wave=27:message=&8[Gladius] &fI've been told the arena grows harder! &cZombies immune to arrows, skeletons that freeze their opponents &f- what will they think of next!?",
                "wave=28:message=&8[Gladius] &fIt's time to show off those &cfencing &fskills! Remember, it's all about the legwork!",
                "wave=29:message=&8[Gladius] &fAnd now, let's have some &ctarget practice&f! The challenger is the target!",
                "wave=30:message=&8[Gladius] &fA true arena champion approaches! The &2Southern Viper &fonce again seeks to &cpoison &ftheir enemies to death with his &cthousand poisons&f!"

        )));
        setMaximumPlayerCount(5);
    }
}
