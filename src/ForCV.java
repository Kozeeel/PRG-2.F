import java.util.Random;
import java.util.Scanner;
public class ForCV {
    public static void main(String[] args) {
//        1. ukol
//        načtěte od uživatele kladné celé číslo n
//        vypište součet čísel od 1 do n

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej celé číslo:");
//
//        int n = sc.nextInt();
//        int soucet = 0;
//
//        for (int i = 1; i <= n; i ++) {
//            soucet += i;
//       }
//        System.out.println("Součet je: " + soucet);


//        2. ukol
//        vypište faktoriál čísla n které načtete od uživatele
//        můžete předpokládát, že uživatel zadá celé číslo od 0 do 12
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej celé číslo od 0-12 :");
//
//        int n = sc.nextInt();
//        int faktorial = 1;
//
//        for (int i = n; i > 0; i --) {
//            faktorial *= i;
//       }
//        System.out.println("Faktorial je: " + faktorial);

        //ruska ruleta
//        Random rmg = new Random();
//        int smrt = 13;
//        int hod = -1;
//        int pocetsmrti = 0;
//        int pocethodu = 100;
//
//        for (int i = 1; i <= pocethodu; i ++) {
//            hod = rmg.nextInt(1, 21);
//
//            if (hod == smrt) {
//                pocetsmrti++;
//            }
//        }
//        System.out.println("Umřel jsi: " + pocetsmrti + "krát.");
//        System.out.println("Počet smrtí v procentech: " + (pocetsmrti * 100.0/ pocethodu);


        Random rmg = new Random();
        int mince = 2;
        int hod = 0;
        int pocetsmrti = 0;
        int pocethodu = 1000000;

        for (int i = 1; i <= pocethodu; i ++) {
            hod = rmg.nextInt(1, 3);

            if (hod == mince) {
                pocetsmrti++;
            }
        }

        System.out.println("Orla si hodil v: " + pocetsmrti * 100.0/ pocethodu + " procentech");
    }
}
