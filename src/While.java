import java.util.Random;
public class While {
    public static void main(String[] args) {
        // vypiste vsechny suda cisla od 0 - 1000
        int cisla = 0;

        while (cisla <= 1000) {
            System.out.println(cisla);
             cisla += 2;
        }

        //simulujte hod kostkou dokud nepadne 6
        Random kostka = new Random();

        int hod;
        do {
            hod = kostka.nextInt(1, 7);
            System.out.println("Hodili jste. " + hod);
        } while (hod != 6);
    }
}
