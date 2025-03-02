package Únor;

import java.util.Scanner;
import java.util.Arrays;

public class Pole_Ukol {
    static String[] inventory = {
            "Spitzhacke",
            "Krankenwagen",
            "Apache-Hubschrauber 3000",
            "Monchhichi",
            "Chihuahua",
            "Gallone Milch",
            "Hubba Bubba",
            "48-Port-Switch",
            "Stiefel",
            "Schwanz eines weißen Wals",
            "DVD-Player",
            "16GB RAM",
            "LGM 30 Minuteman",
            "Lego Ninja Go",
            "Excalibur",
            "50-Meter-Seil",
            "Quanten-Discombobulator",
            "Empfindungsfähiges Gummiente",
            "Unsichtiges Glücks-Frettchen",
            "Zeitreisender Hamster",
            "Kosmische Luftpolsterfolie",
            "Telepathischer Spatel",
            "Interdimensionales Käserad",
            "Verzerrte Lavalampe",
            "Tanzender Kaktus des Chaos",
            "Mystische Fleischkugel",
            "Einhornfürze im Glas",
            "Singender Weltraum-Taco",
            "Antischwerkraft-Banane",
            "Multiversum-Becher",
            "Hellseherischer Toaster",
            "Atom-Schaumbad"
    };
    static char[] rarity = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'};


    static void pridaniSongy(String inventory2, char rarity2) {
        inventory = Arrays.copyOf(inventory, inventory.length + 1);
        rarity = Arrays.copyOf(rarity, rarity.length + 1);

        inventory[inventory.length - 1] = inventory2;
        rarity[rarity.length - 1] = rarity2;
    }

    static void vypisInventory() {

        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Song: " + inventory[i] + " - Hodnocení: " + rarity[i]);
        }
    }

    static void serazeniRating(){
        int rarityPisnicek = rarity.length;
        for (int i = 0; i < rarityPisnicek - 1; i++) {
            for (int j = 0; j < rarityPisnicek - i - 1; j++) {
                if (rarity[j] > rarity[j + 1] || rarity[j] == rarity[j + 1] && inventory[j].compareTo(inventory[j + 1]) > 1) {

                    char temp = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = temp;


                    String tempInventar = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = tempInventar;
                }
            }
        }
    }

    static void serazeniAbeceda(){
        int nazevPisnicek = inventory.length;
        for (int i = 0; i < nazevPisnicek - 1; i++) {
            for (int j = 0; j < nazevPisnicek - i - 1; j++) {
                if (inventory[j].compareTo(inventory[j + 1]) > 1) {

                    char temp = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = temp;


                    String tempInventar = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = tempInventar;
                }
            }
        }
    }
        public static void main (String[]args){

        pridaniSongy("Neco", 'A');
        pridaniSongy("Neco2", 'C');
        pridaniSongy("Nec2o", 'B');
        pridaniSongy("Neco3", 'D');

        serazeniAbeceda();
        vypisInventory();

        System.out.println("");

        serazeniRating();
        vypisInventory();

        }
    }
