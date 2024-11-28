package listopad;

public class CoJaVim {
    public static void main(String[] args) {


        int velikost = 8;

        for (int radek = 0; radek < velikost; radek++) {
            for (int sloupec = 0; sloupec < velikost; sloupec++) {
                if ((sloupec + radek) % 2 == 0) {
                    System.out.print(" ■ ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }

    }
}
