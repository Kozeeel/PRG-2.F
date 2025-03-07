package Březen;

import javax.swing.*;
import java.util.Arrays;

public class Pokus {

    static int soucet(int a, int b){
        int vysledek = a + b;
        return vysledek;
    }
    static boolean isTrue(int cislo){
        return cislo % 2 == 0;
    }

    static String zprava(String jmeno){
        return "Vítej, " + jmeno + "!";
    }

    static int faktorial(int cislo) {

        if (cislo == 0 || cislo == 1) {
            return 1;
        } else {
            return cislo * faktorial(cislo - 1);
        }
    }

    static int fibo(int cislo){
        if (cislo == 0){
            return 0;
        }
        if (cislo == 1) {
            return 1;
        }
        else {
            return fibo(cislo - 1) + fibo(cislo - 2);
        }
    }

    static int[] dvaKrat (int[] pole){
        int[] novepole = new int[pole.length];

        for (int i = 0; i < pole.length; i++) {
            novepole[i] = pole[i] * 2;
        }
        return novepole;
    }


    double[] arr = {-1, -2, -3, -4, -5};
    swap(arr, 1, 3);
        System.out.println(java.util.Arrays.toString(arr));
    public static void main(String[] args) {
        System.out.println(soucet(5,14));
        System.out.println(isTrue(7));
        System.out.println(zprava("sss"));
        System.out.println(faktorial(4));
        System.out.println(fibo(10));

        int [] pole = {1,2,4,8};
        int [] novepole = dvaKrat(pole);
        System.out.println(Arrays.toString(novepole));
    }
}
