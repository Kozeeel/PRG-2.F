package TEST_OOP;

public class BankovniUcet {
    private int cisloUctu;
    private int zustatek;
    private String mena;

    public void vklad(double castka){
        if (castka > 0){
            castka += zustatek;
        }
        System.out.println("Na účet " + cisloUctu + " bylo vloženo " + castka + mena + ". Nový zůstatek: " + zustatek + mena);
    }
    public BankovniUcet(int cisloUctu, int zustatek, String mena) {
        this.cisloUctu = cisloUctu;

        if (zustatek >= 0){
            this.zustatek = zustatek;
        } else {
            zustatek = 0;
        }

        this.mena = mena;
    }

    public BankovniUcet(int cisloUctu){
        this(cisloUctu, 0, "CZK");
    }

    public int getCisloUctu() {
        return cisloUctu;
    }

    public int getZustatek() {
        return zustatek;
    }

    public String getMena() {
        return mena;
    }

    public void setZustatek(int zustatek) {
        if (zustatek >= 0) {
            this.zustatek = zustatek;
        }
    }
}
