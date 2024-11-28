package listopad;

import java.util.Scanner;

public class string_cv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mezera = 1;
        String veta = sc.nextLine();
        //Jak se nazývá hlavní město Zimbabwe.
        veta.indexOf(' ');
        for (int i = 0; i < veta.length(); i++) {
            if (veta.charAt(i) == ' '){
                mezera++;
            }
        }
        System.out.println(mezera);


        sc.close();
    }
}
