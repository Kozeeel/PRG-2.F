package Březen;
import java.util.ArrayList;
public class Listy {
    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList<>();

        auta.add("Škoda");
        auta.add("Mercedes");
        auta.add("Mazda");
        auta.add("Fiat");

        System.out.println(auta.get(0));

        boolean smazat = auta.remove("Fiat");
        System.out.println(smazat);
        System.out.println(auta.size());
        auta.set(1, "Zonda");
        System.out.println(auta.get(1));

        System.out.println(auta);
    }
}
