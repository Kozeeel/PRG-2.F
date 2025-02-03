package leden;

import java.util.Scanner;

public class Metody_ukol2 {

    public static String nacistJmeno(String jmeno) {
        System.out.println("Zadejte své jméno: ");
        Scanner sc = new Scanner(System.in);
        return jmeno = sc.next();
    }

    public static String nacistPrijmeni(String prijmeni) {
        System.out.println("Zadejte své příjmení: ");
        Scanner sc = new Scanner(System.in);
        return prijmeni = sc.next();
    }

    public static String jmenoAprijmeni(String jmeno, String prijmeni){
        String uzivatelskeJmeno = "";

        if (jmeno.length() < 3 ){
            uzivatelskeJmeno += jmeno.toLowerCase();
        } else {
            uzivatelskeJmeno += jmeno.substring(0, 3).toLowerCase();
        }

        if (prijmeni.length() < 3){
            uzivatelskeJmeno += prijmeni.toLowerCase();
        } else {
            uzivatelskeJmeno += prijmeni.substring(0, 3).toLowerCase();
        }
        return uzivatelskeJmeno;
    }

    public static void main(String[] args) {
        String jmeno = nacistJmeno("jmeno");
        String prijmeni = nacistPrijmeni("prijmeni");
        String uzivatelskeJmeno = jmenoAprijmeni(jmeno, prijmeni);

        if (uzivatelskeJmeno.length() <= 5){
            System.out.println("Vaše uživatelské jméno nemá více než 5 znaků, zkuste přidat znak navíc.");
        } else if (!uzivatelskeJmeno.contains(":)")) {
            System.out.println("Uživatelské jméno musí obsahovat :).");
        } else {
            System.out.println("Vaše doporučené uživatelské jméno je: " + uzivatelskeJmeno);
        }
    }
}
