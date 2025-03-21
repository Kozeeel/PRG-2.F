package Březen;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListyCV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> seznamTrid = new ArrayList<>();

        System.out.println("zadejte počet tříd:");
        int pocetTrid = sc.nextInt();

        for (int i = 0; i < pocetTrid; i++) {
            seznamTrid.add(new ArrayList<>());

            System.out.println("Zadejte počet žáků v " + (i + 1) + ". třídě:");
            int pocetZaku = sc.nextInt();
            System.out.println("Zadejte jméno žáka:");

            for (int j = 0; j < pocetZaku; j++) {
                String zak = sc.next();
                seznamTrid.get(i).add(zak);
            }

        }
        for (int i = 0; i < pocetTrid; i++) {
            System.out.println((i + 1) + ". třída: " + seznamTrid.get(0));
        }

    }
}
