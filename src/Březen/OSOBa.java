package Březen;

public class OSOBa {
    private String jmeno;
    private int vek;

    // Bezparametrický konstruktor
    public OSOBa() {
        this("Neznámé jméno", 0); // Volání konstruktoru s parametry pomocí 'this'
    }

    // Konstruktor s jedním parametrem
    public OSOBa(String jmeno) {
        this(jmeno, 0);
    }

    // Konstruktor s dvěma parametry
    public OSOBa(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public void vypisInfo() {
        System.out.println("Jméno: " + jmeno + ", Věk: " + vek);
    }





    public static void main(String[] args) {
        OSOBa o1 = new OSOBa();
        OSOBa o2 = new OSOBa("Karel");
        OSOBa o3 = new OSOBa("Marie", 25);

        o1.vypisInfo();
        o2.vypisInfo();
        o3.vypisInfo();
    }
}
