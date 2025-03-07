package Březen;

public class Test {

    // 1. Metoda pro převedení čísla na druhou mocninu
    public static double square(double x) {
        double mocnina = x * x;
        return mocnina;
    }

    // 2. Metoda swap pro pole celých čísel
    public static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    // 2. Metoda swap pro pole reálných čísel
    // Zde přetížená metoda swap umožňující práci s polem reálných čísel (double[] arr)

    public static void swap2(double[] arr, int pos1, int pos2) {
        double temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    // 3. Metoda, která projde pole a převede všechny prvky na druhou mocninu
    public static void squareAll(double[] arr) {
        for (int i = 0; i < arr.length; i++) {


            arr[i] = arr[Math.pow()];
        }
    }

    public static void main(String[] args) {
        //1. ukol
        System.out.println(square(5));

        //2. ukol (celé čísla)
        int[] arr = {-1, -2, -3, -4, -5};
        swap(arr, 1, 3);
        System.out.println(java.util.Arrays.toString(arr));

        double[] arr = {-1, -2, -3, -4, -5};
        swap(arr, 1, 3);
        System.out.println(java.util.Arrays.toString(arr));

        double[] cisla = {1, 2, 3, 5};
        squareAll(cisla);

    }
}
