package leden;

public class Metody_ukol {

    static void validatePassword(String password) {
        boolean isValid = true;

        if (password.length() < 8) {
            System.out.println("Heslo nesplňuje jednu z podmínek: krátké heslo");
            isValid = false;
        }
        if (password.contains("heslo")) {
            System.out.println("Heslo nesplňuje jednu z podmínek: obsahuje zakázané slovo");
            isValid = false;
        }
        if (password.length() > 11) {
            System.out.println("Heslo nesplňuje jednu z podmínek: dlouhé heslo");
            isValid = false;
        }
        if (isValid) {
            System.out.println("Heslo je v pořádku.");
        }
    }

    public static void main(String[] args) {
        validatePassword("yilatiV");
        System.out.println("");
        validatePassword("heslo12");
        System.out.println("");
        validatePassword("NevimCoZAheslo");
        System.out.println("");
        validatePassword("ChciZaJedna");
    }
}
