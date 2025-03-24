package Březen;

public class Clovek {
    String jmeno;

    String prijmeni;

    int vek;

    int dluh;

    long penize;


    void spat(){
        System.out.println("ZZZZZZZZZZZZZ");
    };

    void zit(){
        System.out.println("Zije");
    }

    void umrit(){
        System.out.println(":(");
    }

    public static void main(String[] args) {
        Clovek jakub = new Clovek();

        jakub.jmeno = "Jakub";
        jakub.prijmeni = "Hnilička";

        Clovek Vaclav = new Clovek();

        Vaclav.jmeno = "Václav";
        Vaclav.prijmeni = "Mach";
        Vaclav.penize = 1_000;
        Vaclav.dluh = 100;
    }
}
