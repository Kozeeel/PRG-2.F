import java.util.Scanner;
import java.util.Random;

public class TestikSracky {
    public static void main(String[] args) {

        //Uživatel chce jít na adrenalinovou atrakci v zábavním parku.
        //Aby mohl vstoupit, musí být starší než 12 let a jeho výška musí být alespoň 140 cm, ale ne více než 200 cm.
        //Program se zeptá uživatele na věk a výšku, a poté vypíše, zda mu je vstup povolen.
        //Scanner sc = new Scanner(System.in);

        //System.out.println("Kolik vám je let?");
        //int vek = sc.nextInt();
        //System.out.println("Kolik měříte centimetrů?");
        //int vyska = sc.nextInt();

        //if (vek > 12 && vyska > 140 && vyska < 200) {
            //System.out.println("Můžete jít na atrakci.");
        //} else {
            //System.out.println("Máte smůlu, na atrakci nemůžete.");
        //}



        //Random nahoda = new Random();

        //int cislo1 = nahoda.nextInt(1, 13);
        //int cislo2 = nahoda.nextInt(1, 13);

        //Není potřeba, jenom to ty čísla vypíše pro kontrolu
        //System.out.println("První číslo je " + cislo1);
        //System.out.println("Druhé číslo je " + cislo2);

        //int soucet = cislo1 + cislo2;

        //if (soucet == 21 || soucet <= 10 || cislo1 == 6 && cislo2 == 6) {
            //System.out.println("Vyhráli jste. Součet čísel je: " + soucet);
        //} else {
            //System.out.println("Máte smůlu, prohráli jste. Součet čísel je: " + soucet);
        //}


//1.
        //Scanner sc = new Scanner(System.in);

        //System.out.println("Zadejte kolik je hodin (0-23).");
        //int hodina = sc.nextInt();

        //if (hodina >= 5 && hodina <= 11) {
            //System.out.println("Dobré ráno.");
        //} else if (hodina >= 12 && hodina <= 17) {
            //System.out.println("Dobré odpoledne.");
        //} else {
            //System.out.println("Dobrý večer.");
        //}
//2.
        //Scanner sc = new Scanner(System.in);

        //int cenaVstupenky = 1200;

        //System.out.println("Kolik vstupenek si chcete koupit?");
        //int pocetVstupenek = sc.nextInt();

        //double celkovaCena = 0;

        //if (pocetVstupenek > 20) {
            //System.out.println("Překročili jste limit vstupenek.");
        //} else if (pocetVstupenek >= 11) {
            //celkovaCena = pocetVstupenek * cenaVstupenky * 0.75;
            //System.out.println("Dostáváte 25% slevu. Celková cena: " + celkovaCena);
        //} else if (pocetVstupenek >= 6) {
            //celkovaCena = pocetVstupenek * cenaVstupenky * 0.85;
            //System.out.println("Dostáváte 15% slevu. Celková cena: " + celkovaCena);
        //} else if (pocetVstupenek >= 1) {
            //celkovaCena = pocetVstupenek * cenaVstupenky;
            //System.out.println("Celková cena: " + celkovaCena);
        //} else {
            //System.out.println("Neplatný počet vstupenek.");
        //}
//3.
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte vaší měsíční spotřebu vody v litrech.");
        int spotreba = sc.nextInt();

        double cenaZaLitrVody = 0;

        if (spotreba >= 0 && spotreba <= 4999) {
            cenaZaLitrVody = 0.03;
        } else if (spotreba >= 5000 && spotreba <= 9999) {
            cenaZaLitrVody = 0.025;
        } else if (spotreba >= 10000 && spotreba <= 14999) {
            cenaZaLitrVody = 0.02;
        } else {
            cenaZaLitrVody = 0.015;
        }

        double celkovaCena = spotreba * cenaZaLitrVody;

        System.out.println("Za tento měsíc zaplatíte: " + celkovaCena + "Kč.");
    }
}