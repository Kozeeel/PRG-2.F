package leden;

public class Argumenty {

    static void doubleA(int a){
        a = a * 2;
        System.out.println(a);
    }

    static void pridatKonec(StringBuilder text) {
        text.append(" konec");
    }
    public static void main(String[] args) {
//        int a = 5;
//        doubleA(a);
//
//        System.out.println(a);


        StringBuilder mujText = new StringBuilder("Začátek");

        System.out.println(mujText);

        pridatKonec(mujText);

        System.out.println(mujText);
    }
}
