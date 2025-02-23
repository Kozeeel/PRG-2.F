package leden;

public class dvd {
    static void validatePassword(String password){

        // 1. Heslo musí být alespoň 8 znaků.

        if (password.length() < 8) {
            System.out.println("Heslo nesplňuje jednu z podmínek: délka");
            return;
        }


        // 2. Heslo nesmí obsahovat slovo "heslo"

        if (password.toLowerCase().contains("heslo")) { // contains mi tady zkontroluje, jestli v textu je podřetězec "heslo"
            System.out.println("Heslo nesplňuje jednu z podmínek: obsahuje zakázané slovo");
            return;
        }


        // 3. Vaše libovolná podmínka

        if (password.equals(password.toLowerCase())) {
            System.out.println("Heslo nesplňuje jednu z podmínek: neobsahuje velké písmeno");
            return;
        }

        System.out.println("Heslo je v pořádku");
    }

    public static void main(String[] args) {

        validatePassword("yilatiV"); // Nesplňuje: obsahuje zakázané slovo
        validatePassword("heslo12");   // Nesplňuje: délka hesla
        validatePassword("NevimCoZAheslo"); // Nesplňuje: neobsahuje velké písmeno
        validatePassword("Javasuper123");  // Splňu
    }
}

