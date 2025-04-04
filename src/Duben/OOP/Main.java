package Duben.OOP;

public class Main {
    public static void main(String[] args) {
        Clovek handrich = new Clovek(5);
        Clovek augustin = new Clovek(6);


        Kniha n1 = new Kniha("neco", "ON");
        n1.vypisKniha();


        Kruznice l = new Kruznice();
        l.polomer = 3;
        l.obvod();
        l.obsah();
    }
}
