package com.company;

import java.util.*;

public class CompanionFeatures {

    public String getSprays(String key) {
        HashMap<String, String> sprayHash = new HashMap<String, String>();

        sprayHash.put("Ak-47",
                " .........................&.......................\n" +
                "..................................................\n" +
                "..................................................\n" +
                ".......................%..........................\n" +
                "....................&.............................\n" +
                "..................................................\n" +
                "..................................................\n" +
                ".............&....................................\n" +
                "...............&..................................\n" +
                ".....................&............................\n" +
                ".........................,,..(%...................\n" +
                ".....................................&............\n" +
                "......................................,&..........\n" +
                ".......................................&..........\n" +
                ".....................................&,...........\n" +
                "..................................*&..............\n" +
                "...............................&..................\n" +
                "...........................&......................\n" +
                "....................&.............................\n" +
                ".......#./........................................\n" +
                "......&...........................................\n" +
                "..................................................\n" +
                "...............*..................................\n" +
                "...................&..............................\n" +
                "........................,.........................\n" +
                "..................................................\n");


        sprayHash.put("LR-300",
                ".........................:&.......................\n" +
                ".............................................-----\n" +
                ".........................&-...............--------\n" +
                ".......................................-----------\n" +
                ".......................-&-.........---------------\n" +
                "........................:.....--------------------\n" +
                "......................&....-----------------------\n" +
                ".....................-&---------------------------\n" +
                "..................--------------------------------\n" +
                "................---&/-----------------------------\n" +
                "............--------------------------------------\n" +
                "........--------:&--------------------------------\n" +
                "....----------&-----------------------------------\n" +
                "..------------&-----------------------------------\n" +
                "------------+&------------------------------------\n" +
                "-----------:&-------------------------------------\n" +
                "------------:&/-----------------------------------\n" +
                "----------------&+--&:----------------------------\n" +
                "--------------------&:-&/::-----------------------\n" +
                "----------------------:&+s+-----------------------\n" +
                "----------&-/&-&:-&/&:/&:------------------------\n" +
                "---/&s:&:/&-/:-&----------------------------------\n" +
                "---/:&:----&:----:&----&:-------------------------\n" +
                "---------------&-----&:-------------------------\n" +
                "--------------------------------------------------"

        );

        sprayHash.put("MP5",
                        "..................................................\n" +
                        ".........................:&......................-\n" +
                        "............................................------\n" +
                        ".........................:&...............--------\n" +
                        ".......................................-----------\n" +
                        ".........................:&........---------------\n" +
                        ".........................-&...--------------------\n" +
                        ".........................-&-----------------------\n" +
                        ".......................--:&-----------------------\n" +
                        "..................--------------------------------\n" +
                        "................------------&:--------------------\n" +
                        "............----------------:-&+------------------\n" +
                        "........-----------------------&------------------\n" +
                        "....------------------------------&---------------\n" +
                        "..------------------------------------&+----------\n" +
                        "---------------------------------------------&:---\n" +
                        "---------------------------------------------&+---\n" +
                        "-----------------------------------------:&-&:---\n" +
                        "--------------------------------:&--:&----:-------\n" +
                        "--------------------------------&+/---------------\n" +
                        "---------------------------------:&-+&-:&--&:-&:--\n" +
                        "--------------------------o&:&:&/:+&//-&//+/&/&s:-\n" +
                        "-----------------------------:-:--:-::-::::-:-:---\n" +
                        "--------------------------------------------------"
        );

        sprayHash.put("Thompson",
                "..................................................\n" +
                        ".........................:&.......................\n" +
                        "...............................................---\n" +
                        "......................&.....................------\n" +
                        "........................................----------\n" +
                        "....................&................-------------\n" +
                        "...................-&-............----------------\n" +
                        "......................&........-------------------\n" +
                        ".........................&..----------------------\n" +
                        "......................&---------------------------\n" +
                        ".................-&-------------------------------\n" +
                        "................----------------------------------\n" +
                        "............--------------------------------------\n" +
                        "........------------------------------------------\n" +
                        "....---------------&------------------------------\n" +
                        "-------------------&------------------------------\n" +
                        "--------------------------------------------------\n" +
                        "--------------------------------------------------\n" +
                        "-----------------------&--------------------------\n" +
                        "-----------------------&:-------------------------\n" +
                        "--------------------------------------------------\n" +
                        "--------------------------------------------------\n" +
                        "----------------------------&---------------------\n" +
                        "----------------------------&---------------------\n" +
                        "--------------------------------------------------\n" +
                        "--------------------------------&-----------------\n" +
                        "-------------------------------:&:----------------\n" +
                        "--------------------------------------------------\n" +
                        "---------------------------------&:---------------\n" +
                        "---------------------------------&:---------------\n" +
                        "------------------------------:&------------------\n" +
                        "------------------------------&:------------------\n" +
                        "-------------------------:&-----------------------\n" +
                        "-------------------------+&:----------------------\n" +
                        "-----------------::-&&--::::::::::::::::----------\n" +
                        "-----------------::::&::::::::::::::::::::::::::::\n" +
                        "------------::::::::::::::::::::::::::::::::::::::\n" +
                        "---------:::::::::+&::::::::::::::::::::::::::::::\n" +
                        "------:::::::::::::&::::::::::::::::::::::::::::::\n" +
                        "-----::::::::::::::::::&::::::::::::::::::::::::::\n" +
                        "--:::::::::::::::::::::&::::::::::::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::&/:::::::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::::::&/:::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::::::::&/:::::::::::::::\n" +
                        "::::::::::::::::::::::::::::::::&:::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::::/&:::::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::&/:::::::::::::::::::::"
        );

        sprayHash.put("Custom-SMG",
                "..................................................\n" +
                        ".........................:&......................-\n" +
                        "............................................------\n" +
                        "..........................................--------\n" +
                        ".....................:&................-----------\n" +
                        "......................&...........----------------\n" +
                        "..............................--------------------\n" +
                        "..........................------------------------\n" +
                        "..................&-...---------------------------\n" +
                        "..................&-------------------------------\n" +
                        "..............------------------------------------\n" +
                        "...........---------------------------------------\n" +
                        "........----------&-------------------------------\n" +
                        "....--------------&-------------------------------\n" +
                        ".-------------------------------------------------\n" +
                        "--------------------------------------------------\n" +
                        "--------------------&:----------------------------\n" +
                        "--------------------------------------------------\n" +
                        "--------------------------------------------------\n" +
                        "------------------------&-------------------------\n" +
                        "------------------------&-------------------------\n" +
                        "---------------------------&:---------------------\n" +
                        "---------------------------&:---------------------\n" +
                        "--------------------------------------------------\n" +
                        "--------------------------------------------------\n" +
                        "-------------------------------&+-----------------\n" +
                        "--------------------------------------------------\n" +
                        "---------------------------------&:---------------\n" +
                        "---------------------------------&:---------------\n" +
                        "-------------------------------:&:----------------\n" +
                        "-------------------------------:&:----------------\n" +
                        "----------------------------:&--------------------\n" +
                        "------------------------::--&/--------------------\n" +
                        "------------------------/&:---------::-:::::::::::\n" +
                        "----------------:::::*::::::::::::::::::::::::::::\n" +
                        "-------------::::::::&::::::::::::::::::::::::::::\n" +
                        "----------:-::::::+&::::::::::::::::::::::::::::::\n" +
                        "---------:::::::::/&::::::::::::::::::::::::::::::\n" +
                        "--:-::::::::::::::/&::::::::::::::::::::::::::::::\n" +
                        "::::::::::::::::::::/&::::::::::::::::::::::::::::\n" +
                        "::::::::::::::::::::::::&/::::::::::::::::::::::::\n" +
                        "::::::::::::::::::::::::::::&:::::::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::::::&//::::::::::::::::\n" +
                        "::::::::::::::::::::::::::::::::&s::::::::::::::::\n" +
                        ":::::::::::::::::::::::::::::::&//::::::::::::::::\n" +
                        "::::::::::::::::::::::::::::/&::::::::::::::::::::\n" +
                        "::::::::::::::::::::::::::/&::::::::::::::::::::::\n" +
                        "::::::::::::::::::::::::::::::::::::::::::::::::::"
        );

        sprayHash.put("M249",
                        "..................................................\n" +
                        ".........................:&.......................\n" +
                        ".........................&:.....................--\n" +
                        ".........................&-.................------\n" +
                        ".........................&-.............----------\n" +
                        "........................-&-..........-------------\n" +
                        "........................-&-.......----------------\n" +
                        ".........................&-....-------------------\n" +
                        "........................-&-.----------------------\n" +
                        ".......................--*------------------------\n" +
                        "...................------&------------------------\n" +
                        "................---------&------------------------\n" +
                        "............------------+&------------------------\n" +
                        "........----------------/&------------------------\n" +
                        "....--------------------&:------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------&------------------------\n" +
                        "-------------------------:&-----------------------\n" +
                        "-------------------------:&-----------------------\n" +
                        "-------------------------:&-----------------------\n" +
                        "-------------------------:&-----------------------\n" +
                        "--------------------------&:----------------------\n" +
                        "--------------------------&/----------------------\n" +
                        "--------------------------&/----------------------\n" +
                        "--------------------------&:----------------------\n" +
                        "-------------------------:&:----------------------\n" +
                        "-------------------------:&:----------------------\n" +
                        "--------------------------&:----------------------\n" +
                        "--------------------------&/----------------------\n" +
                        "-----------------::-----::&/:::::::::::-----------\n" +
                        "-----------------:::::::::&+::::::::::::::::::::::\n" +
                        "------------::::::::::::::&/::::::::::::::::::::::\n" +
                        "---------:::::::::::::::::&+::::::::::::::::::::::\n" +
                        "------:::::::::::::::::::::&::::::::::::::::::::::\n" +
                        "-----::::::::::::::::::::::&::::::::::::::::::::::"
        );



        return sprayHash.get(key);

    }


}