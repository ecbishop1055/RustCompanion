package com.company;
import Database.Connect;
import java.util.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Random;


public class Main {
    static Scanner keyboard = new Scanner(System.in);
    Connect conn = new Connect();
    public static void main(String[] args) throws SQLException {
        System.out.println("" +
                "        #((((((((((((((((((((((((((((((((( \n" +
                "        #((((((((((((((((((((((((((((((((( \n" +
                "        #((((((((((((((&&&&&&&(((((((((((( \n" +
                "        ((((((((((((((((&&&&&&(((((((((((( \n" +
                "        #((((((((((((((((####((((((((((((( \n" +
                "        #(((((((((((((((#&&&&((((((((((((( \n" +
                "        #((((&&&&&&&(&&((((((((((((((((((( \n" +
                "        #((((&&&&&&&(&&((%&((&&(((((((((((  \n" +
                "        #((((&&&&&(((((((((&&&((&@((((((((  \n" +
                "        (((((((((((((((((((((&&&&&&&&%(((( \n" +
                "        #(((((((((((((((((((((%&&&&&((((((  \n" +
                "        ((((((((((((((((((((((((&&((((((((  \n" +
                "        ((((((((((((((((((((((((((((((((((");
        System.out.println("Welcome to the Rust Companion!");
        CompanionFeatures gunSprays = new CompanionFeatures();
        Recipe Recipe = new Recipe();
        Connect.createNewTable();
//        System.out.println(gunSprays.getSprays("LR-300"));
        while (true) {
            String input = loginAndCreateMenu();
            if (input.equalsIgnoreCase("create account")){
                System.out.println("Please enter your information as prompted!");
                System.out.print("Username: ");
                String username = keyboard.nextLine();
                System.out.print("Password: ");
                String password = keyboard.nextLine();
                int userID;
                int randomIdNum = 10000;
                Random rand = new Random();
                userID = rand.nextInt(randomIdNum);
                Connect.createNewUser(userID, username, password);

            }
            while (true) {
                 input = mainMenu();
                if (input.equals("spray patterns")) {
                    while (true) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        input = sprayMenu();
                        if (input.equals("a")) {
                            System.out.println(gunSprays.getSprays("Ak-47"));
                        } else if (input.equals("b")) {
                            System.out.println(gunSprays.getSprays("LR-300"));
                        } else if (input.equals("c")) {
                            System.out.println(gunSprays.getSprays("Thompson"));
                        } else if (input.equals("d")) {
                            System.out.println(gunSprays.getSprays("Custom-SMG"));
                        } else if (input.equals("e")) {
                            System.out.println(gunSprays.getSprays("MP5"));
                        } else if (input.equals("f")) {
                            System.out.println(gunSprays.getSprays("M249"));
                        } else if (input.equals("g")) {
                            break;
                        }
                    }
                } else if (input.equalsIgnoreCase("raid companion")) {
                    while (true) {
                        input = craftMenu();
                        if (input.equalsIgnoreCase("satchel charge")) {
                            // setting item amounts
                            Recipe.itemsHash.put("bean-can", 4);
                            Recipe.itemsHash.put("stash", 1);
                            Recipe.itemsHash.put("rope", 1);
                            Recipe.itemsHash.put("workbench-Level", 2);
                            // pulling item amounts
                            int beanCans = Recipe.itemsHash.get("bean-can");
                            int stash = Recipe.itemsHash.get("stash");
                            int rope = Recipe.itemsHash.get("rope");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For a satchel charge you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            beanCans + " - Bean-Cans \n" +
                                            stash + " - Stash \n" +
                                            rope + "ft - Rope \n"

                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            beanCans * amount + " - Bean-Cans \n" +
                                            stash * amount + " - Stash's \n" +
                                            rope * amount + "ft - Rope \n"
                            );
                            keyboard.nextLine();


                        } else if (input.equalsIgnoreCase("c4")) {
                            // setting item amounts
                            Recipe.itemsHash.put("explosives", 20);
                            Recipe.itemsHash.put("cloth", 5);
                            Recipe.itemsHash.put("tech-trash", 2);
                            Recipe.itemsHash.put("workbench-Level", 3);
                            // pulling item amounts
                            int explosives = Recipe.itemsHash.get("explosives");
                            int cloth = Recipe.itemsHash.get("cloth");
                            int techTrash = Recipe.itemsHash.get("tech-trash");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For a C4 you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            explosives + " - Explosives \n" +
                                            cloth + " - Cloth \n" +
                                            techTrash + " Tech-Trash \n"

                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            explosives * amount + " - Explosives \n" +
                                            cloth * amount + " - Cloth \n" +
                                            techTrash * amount + " Tech-Trash \n"
                            );
                            keyboard.nextLine();
                        } else if (input.equalsIgnoreCase("rocket launcher")) {
                            // setting item amounts
                            Recipe.itemsHash.put("high-quality-metal", 40);
                            Recipe.itemsHash.put("pipes", 4);
                            Recipe.itemsHash.put("workbench-Level", 2);
                            // pulling item amounts
                            int hqMetal = Recipe.itemsHash.get("high-quality-metal");
                            int pipes = Recipe.itemsHash.get("pipes");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For a Rocket Launcher you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            hqMetal + " - Explosives \n" +
                                            pipes + " - Cloth \n"


                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            hqMetal * amount + " - Explosives \n" +
                                            pipes * amount + " - Cloth \n"
                            );
                            keyboard.nextLine();

                        } else if (input.equalsIgnoreCase("explosive ammo")) {
                            // setting item amounts
                            Recipe.itemsHash.put("metal-frags", 10);
                            Recipe.itemsHash.put("gun-powder", 4);
                            Recipe.itemsHash.put("sulfur", 10);
                            Recipe.itemsHash.put("workbench-Level", 3);
                            // pulling item amounts
                            int metalFrags = Recipe.itemsHash.get("metal-frags");
                            int gunPowder = Recipe.itemsHash.get("gun-powder");
                            int sulfur = Recipe.itemsHash.get("sulfur");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For Explosive 5.56 Ammo you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            metalFrags + " - Metal-Fragments \n" +
                                            gunPowder + " - Gun-Powder \n" +
                                            sulfur + " - Sulfur \n"

                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            metalFrags * amount + " - Metal-Fragments \n" +
                                            gunPowder * amount + " - Gun-Powder \n" +
                                            sulfur * amount + " - Sulfur \n"
                            );
                            keyboard.nextLine();
                        } else if (input.equalsIgnoreCase("rocket")) {
                            // setting item amounts
                            Recipe.itemsHash.put("pipes", 2);
                            Recipe.itemsHash.put("gun-powder", 150);
                            Recipe.itemsHash.put("explosives", 10);
                            Recipe.itemsHash.put("workbench-Level", 3);
                            // pulling item amounts
                            int pipes = Recipe.itemsHash.get("pipes");
                            int gunPowder = Recipe.itemsHash.get("gun-powder");
                            int explosive = Recipe.itemsHash.get("explosives");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For a Rocket you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            pipes + " - Pipes \n" +
                                            gunPowder + " - Gun-Powder \n" +
                                            explosive + " - Explosives \n"

                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            pipes * amount + " - Pipes \n" +
                                            gunPowder * amount + " - Gun-Powder \n" +
                                            explosive * amount + " - Explosives \n"
                            );
                            keyboard.nextLine();
                        } else if (input.equalsIgnoreCase("hvr")) {
                            // setting item amounts
                            Recipe.itemsHash.put("gun-powder", 100);
                            Recipe.itemsHash.put("pipes", 1);
                            Recipe.itemsHash.put("workbench-Level", 2);
                            // pulling item amounts
                            int gunPowder = Recipe.itemsHash.get("gun-powder");
                            int pipes = Recipe.itemsHash.get("pipes");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For a High Velocity Rocket you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            gunPowder + " - Gun-Powder \n" +
                                            pipes + " - Pipe \n"

                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            gunPowder * amount + " - Gun-Powder \n" +
                                            pipes * amount + " - Pipe \n"
                            );
                            keyboard.nextLine();
                        } else if (input.equalsIgnoreCase("ir")) {
                            // setting item amounts
                            Recipe.itemsHash.put("pipes", 2);
                            Recipe.itemsHash.put("gun-powder", 250);
                            Recipe.itemsHash.put("low-grade", 250);
                            Recipe.itemsHash.put("explosives", 1);
                            Recipe.itemsHash.put("workbench-Level", 2);
                            // pulling item amounts
                            int pipes = Recipe.itemsHash.get("pipes");
                            int gunPowder = Recipe.itemsHash.get("gun-powder");
                            int lowGrade = Recipe.itemsHash.get("low-grade");
                            int explosives = Recipe.itemsHash.get("explosives");
                            int workbenchLevel = Recipe.itemsHash.get("workbench-Level");
                            System.out.println(
                                    "For an Incendiary you will need \n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            pipes + " - Pipes \n" +
                                            gunPowder + " - Gun-Powder \n" +
                                            lowGrade + " - Low-Grade-Fuel \n" +
                                            explosives + " - Explosives \n"

                            );
                            System.out.println("How many would you like to craft?");
                            int amount = keyboard.nextInt();
                            System.out.println(
                                    "You will need these resources to craft " + amount + "\n" +
                                            "WorkBench Level - " + workbenchLevel + "\n" +
                                            pipes * amount + " - Pipes \n" +
                                            gunPowder * amount + " - Gun-Powder \n" +
                                            lowGrade * amount + " - Low-Grade-Fuel \n" +
                                            explosives * amount + " - Explosives \n"
                            );
                            keyboard.nextLine();
                        } else if (input.equalsIgnoreCase("exit")) {
                            break;
                        }

                    }
                } else if (input.equalsIgnoreCase("quit")) {
                    System.exit(0);
                }
            }
        }
    }


    private static String mainMenu() {
       System.out.println();
       System.out.println("Please pick what you would like to do by typing the name.");
       System.out.println(
               "- Spray Patterns \n" +
               "- Raid Companion \n" +
               "- Quit \n"

       );
        System.out.print("> ");
       String input = keyboard.nextLine();
       while (!input.equalsIgnoreCase("spray patterns") && !input.equalsIgnoreCase("raid companion") && !input.equalsIgnoreCase("quit")) {
           System.out.println("Pick a valid feature!");
           System.out.println();
           System.out.println(
                   "- Spray Patterns \n" +
                   "- Raid Companion \n" +
                   "- Quit \n"

           );
           System.out.print("> ");
           input = keyboard.nextLine();
           while (input.equalsIgnoreCase("spray patterns") || input.equalsIgnoreCase("raid companion") || input.equalsIgnoreCase("quit")){
               break;
           }
       }
       return input;

    }

    private static String craftMenu() {
        System.out.println();
        System.out.println("Welcome to the raid companion. \n" +
                "This tool will help you find out how much of a resource you need to craft items. \n" +
                "It will also tell you how many you can craft based on the amount of resources you already have."
        );
        System.out.println("Please select the raid item you would like to craft!");
        System.out.println("" +
              "- Satchel Charge \n" +
              "- C4 \n" +
              "- Rocket Launcher \n" +
              "- Explosive 5.56 Rifle Ammo (just type explosive ammo) \n" +
              "- Rocket \n" +
              "- High Velocity Rocket (just type HVR) \n" +
              "- Incendiary Rocket (just type IR) \n" +
              "- exit \n"
                );
        System.out.print("> ");
        String input = keyboard.nextLine();
        while (!input.equals("satchel charge") && !input.equalsIgnoreCase("c4") && !input.equalsIgnoreCase("rocket launcher") && !input.equalsIgnoreCase("explosive ammo") && !input.equalsIgnoreCase("Rocket") && !input.equalsIgnoreCase("hvr") && !input.equalsIgnoreCase("ir") && !input.equalsIgnoreCase("exit")){
            System.out.println();
            System.out.println("Please select a valid option!");
            System.out.println("" +
                    "- Satchel Charge \n" +
                    "- C4 \n" +
                    "- Rocket Launcher \n" +
                    "- Explosive 5.56 Rifle Ammo (just type explosive ammo) \n" +
                    "- Rocket \n" +
                    "- High Velocity Rocket (just type HVR) \n" +
                    "- Incendiary Rocket (just type IR) \n" +
                    "- exit \n"
            );
            System.out.print("> ");
            input = keyboard.nextLine();
            if (input.equals("satchel charge") || input.equalsIgnoreCase("c4") || input.equalsIgnoreCase("rocket launcher") || input.equalsIgnoreCase("explosive ammo") || input.equalsIgnoreCase("Rocket") || input.equalsIgnoreCase("hvr") || input.equalsIgnoreCase("ir") || input.equalsIgnoreCase("exit")){
                break;
            }
        }
        return input;
    }

    private static String loginAndCreateMenu() {
        System.out.println();
        System.out.println("Please pick what you would like to do by typing the name.");
        System.out.println(
                        "- Login  \n" +
                        "- Create Account \n" +
                        "- Quit \n"

        );
        System.out.print("> ");
        String input = keyboard.nextLine();
        while (!input.equalsIgnoreCase("login") && !input.equalsIgnoreCase("create account") && !input.equalsIgnoreCase("quit")) {
            System.out.println("Pick a valid feature!");
            System.out.println();
            System.out.println(
                            "- Login  \n" +
                            "- Create Account \n" +
                            "- Quit \n"

            );
            System.out.print("> ");
            input = keyboard.nextLine();
            while (input.equalsIgnoreCase("login") || input.equalsIgnoreCase("create account") || input.equalsIgnoreCase("quit")){
                break;
            }
        }
        return input;

    }

    private static String sprayMenu() {
        System.out.println();
        System.out.println("Please select the gun you would like to learn the spray of!");
        System.out.println("" +
                "a. Ak-47 \n" +
                "b. LR-300 \n" +
                "c. Thompson \n" +
                "d. Custom SMG \n" +
                "e. MP5 \n" +
                "f. M249 \n" +
                "g. exit \n"

        );
        System.out.print("> ");
        String input = keyboard.nextLine().toLowerCase();
        while (!input.equals("a") && !input.equals("b") && !input.equals("c") && !input.equals("d") && !input.equals("e") && !input.equals("f") && !input.equals("g")) {
            System.out.println("Pick a valid letter!");
            System.out.println();
            System.out.println("" +
                    "a. Ak-47 \n" +
                    "b. LR-300 \n" +
                    "c. Thompson \n" +
                    "d. Custom SMG \n" +
                    "e. MP5 \n" +
                    "f. M249 \n" +
                    "g. exit \n"

            );
            System.out.print("> ");
            input = keyboard.nextLine().toLowerCase();
            if (input.equals("a") || input.equals("b") || input.equals("c") || input.equals("d") || input.equals("e") || input.equals("f") || input.equals("g")){
               break;
            }

        }
        return input;
    }
}
