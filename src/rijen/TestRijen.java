package rijen;

import java.util.Scanner;
import java.util.Random;
public class TestRijen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik měříte centimetrů? (0-250)");
        int vyska = sc.nextInt();

        if (vyska < 0 || vyska > 250) {
            System.out.println("ERROR");
        } else if (vyska >= 140) {
            System.out.println("Můžete jet na této atrakci.");
        } else {
            System.out.println("Máte smůlu, ale na atrakci nemůžete, jste buď prcek nebo neexistujete.");
        }


        Random hod = new Random();
        int hodKostkou1 = hod.nextInt(1, 7);
        int hodKostkou2 = hod.nextInt(1, 7);

        System.out.println("Hod 1: " + hodKostkou1);
        System.out.println("Hod 2: " + hodKostkou2);

        int soucet = hodKostkou1 + hodKostkou2;
        if (soucet == 7 || soucet == 11) {
            System.out.println("Gratulace, právě jstevyhráli poukaz do Lidlu!!!!");
        } else {
            System.out.println("Máte smůlu.");
        }


        Scanner sc1 = new Scanner(System.in);

        int cenaListku = 150;

        System.out.println("Dobrý den, kolik si chcete objednat lístků?");
        int pocetListku = sc.nextInt();

        double celkovaCena = 0;

        if (pocetListku > 50) {
            System.out.println("Nákup zrušen. Překročili jste možný limit.");
        } else if (pocetListku > 10) {
            celkovaCena = pocetListku * cenaListku * 0.7;
            System.out.println("Dobře, dostáváte 30% slevu, celková cena nákupu bude: " + celkovaCena + "Kč");
        } else if (pocetListku > 5) {
            celkovaCena = pocetListku * cenaListku * 0.85;
            System.out.println("Dobře, dostáváte 15% slevu, celková cena nákupu bude: " + celkovaCena + "Kč");
        } else {
            celkovaCena = pocetListku * cenaListku;
            System.out.println("Dobře, celková cena nákupu bude: " + celkovaCena + "Kč");
        }
    }
}
