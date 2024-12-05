package listopad;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
//        String cislo = "123";
//        int c = 55;
//
//        String textNeText = String.valueOf(c);
//        int cisloNeCislo = Integer.parseInt(cislo);
//
//        textNeText = cisloNeCislo;
//        System.out.println(textNeText);

        // string >>> int + 10, vypsat nový číslo
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadejte číslo");
//        String radka = sc.nextLine();
//
//        int neco = Integer.parseInt(radka);
//        neco += 10;
//        System.out.println(neco);

// zacatek a konec vety KONTROLA
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Zadejte větu.");
//        String veta = sc.nextLine();
//
//        String zacatekVety = "Java";
//        String konecVety = "rocks";
//
//        System.out.println("Řetězec začína na " + zacatekVety + ": " + veta.startsWith(zacatekVety));
//        System.out.println("Řetězec začína na " + konecVety + ": " + veta.endsWith(konecVety));

        //indexi na zacatku a konci
        Scanner sc = new Scanner(System.in);

        System.out.println("Veta: ");
        String veta = sc.nextLine();

        System.out.println("Zadejte začatek (index): ");
        int zacatek = sc.nextInt();
        System.out.println("Zadejte konec (index): ");
        int konec = sc.nextInt();

        System.out.println(veta.substring(zacatek, konec));
    }
}
