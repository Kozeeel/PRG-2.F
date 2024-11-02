package listopad;

import java.util.Random;
import java.util.Scanner;

public class listopadTestCV {
    public static void main(String[] args) {
        //For
        //hoďtě kostkou 10 000 000 a vypište v kolika případech (v procentech) padla 3
//        Random rmg = new Random();
//        int mince = 3;
//        int hod = 0;
//        int pocettrojek = 0;
//        int pocethodu = 10000000;
//
//        for (int i = 1; i <= pocethodu; i ++) {
//            hod = rmg.nextInt(1, 7);
//
//            if (hod == mince) {
//                pocettrojek++;
//            }
//        }
//
//        System.out.println("Trojku si hodil v: " + (pocettrojek * 100.0/ pocethodu + " procentech"));

        //nevim
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int hvezdicky = 0;
//
//        for (int i = 1; i <= n; i++) {
//            hvezdicky += i;
//        }
//        System.out.println("*");

        //while (nevim)
        Scanner sc = new Scanner(System.in);
        int cislo;
        int nejvetsicislo = 0;

        do {
            System.out.println("Zadejte číslo: ");
            cislo = sc.nextInt();
            if (cislo > cislo) {
                nejvetsicislo++;
            }
        } while (cislo > 0);
        System.out.println("Největší číslo je: " + nejvetsicislo);
    }
}
