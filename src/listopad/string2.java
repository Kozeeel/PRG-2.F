package listopad;

public class string2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadejte neco: ");
//        String jmeno = sc.next();
//        int delkaJmena = jmeno.length();
//        System.out.println(delkaJmena);
//        System.out.println(jmeno.toUpperCase());

        String jmeno = "Pepa";
        String prijmeni = "Skocdopole";
        prijmeni = prijmeni.replace("Skocdopole", "Nejezchleba");
//        System.out.println(jmeno.charAt(5));

        System.out.println(jmeno.toLowerCase());
        System.out.println(jmeno.toUpperCase());
        System.out.println(jmeno.equals(prijmeni));

        System.out.println(jmeno.trim());
        System.out.println(jmeno.strip());

        System.out.println(jmeno.length());
        System.out.println(jmeno.indexOf("P"));
    }
}
