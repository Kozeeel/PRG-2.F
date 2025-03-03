package Březen;

public class Test_cv {
    static double soucet(){
        int a = 8;
        int b = 5;
        int soucet2 = a + b;
        return soucet2;
    }

    static boolean isTrue (int cisla){
        return cisla % 2 == 0;
    }

    static String zprava(String jmeno){
        return "Ahoj " + jmeno + ", vítáme tě tady!";
    }

    static double mocnina(int a, int b){

        if (b == 0){
            return 1;
        } else if (b < 0) {
            return 1;
        }

        return a * mocnina(a, b - 1);
    }

//    static double faktorial(int cislo){
//        int vysledek = 1;
//
//        for (int i = 1; i < cislo; i++) {
//            vysledek = vysledek * 1;
//        }
//        return vysledek;
//    }
    public static void main(String[] args) {
        System.out.println(soucet());
        System.out.println(isTrue(5));
        System.out.println(zprava("dabda"));
        System.out.println(mocnina(2, 5));
//        System.out.println(faktorial(5));
    }
}
