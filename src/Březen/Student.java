package Březen;

import java.util.Random;

public class Student {
    private String jmeno;
    private int znamky[];

    public Student(String jmeno, int pocetZnamek) {
        this.jmeno = jmeno;
        this.znamky = new int [pocetZnamek];
    }

    public int genZnamek() {
        Random rng = new Random();
        return rng.nextInt(6);
    }

    public void genZnamky() {
        for (int i = 0; i < znamky.length; i++) {
            znamky[i] = genZnamek();
        }
    }

    public void vypisInfo() {
        System.out.println("Jméno: " + jmeno + ", Znamky: " + znamky);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Jan", 6);
        student1.genZnamek();
    }
}
