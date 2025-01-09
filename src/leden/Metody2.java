package leden;

import java.util.Scanner;

public class Metody2 {
    static double soucet(){
        int a = 10;
        int b = 5;
        double c = Math.PI;
        double obvod = c * a * b;

        return obvod;
    }

    static double nactiCislo(int a){
        a += 15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo: ");
        double vstup = sc.nextDouble();

        return vstup;
    }

    static void print(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
//        double vstup1 = nactiCislo(16);
//        double vstup2 = nactiCislo(3361);
//        System.out.println(vstup1 + vstup2);


        print("Ahoj metodo!");
    }
}
