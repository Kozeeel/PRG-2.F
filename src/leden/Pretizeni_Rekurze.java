package leden;

public class Pretizeni_Rekurze {

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static void printMessage( int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
        return;
        printMessage(count, message);
    }
    public static void main(String[] args) {
        printMessage("Ahoj", 3);
        printMessage(5, "Něco");
    }
}
