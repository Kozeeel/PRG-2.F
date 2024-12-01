package listopad;

import java.util.Scanner;

public class string_ukol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte své křestní jméno: ");
        String jmeno = sc.nextLine();

        System.out.println("Zadejte své příjmení: ");
        String prijmeni = sc.nextLine();

        String Upperjmeno = jmeno.toUpperCase();
        String Upperprijmeni = prijmeni.toUpperCase();

        String jmenoPozpatku = " ";
        for (int i = Upperjmeno.length() - 1; i >= 0; i--) {
            jmenoPozpatku += Upperjmeno.charAt(i);
        }

        String prijmeniPozpatku = " ";
        for (int i = Upperprijmeni.length() - 1; i >= 0; i--) {
            prijmeniPozpatku += Upperprijmeni.charAt(i);
        }

        System.out.println(jmenoPozpatku + " " + prijmeniPozpatku);

        sc.close();
    }
}
