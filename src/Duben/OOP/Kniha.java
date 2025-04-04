package Duben.OOP;

public class Kniha {
    String nazev;
    String autor;
    public Kniha(){};

    public Kniha(String nazev, String autor){
        this.nazev = nazev;
        this.autor = autor;
    }
    public void vypisKniha() {
        System.out.println(nazev + " - " + autor);
    }
}
