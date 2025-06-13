package Cerven;

public class Main {
    public static void main(String[] args) {
//        Vehicle V = new Vehicle();
//        V.move();
//
//        Car C = new Car();
//        C.move();
//
//        C.barva = "blue";
//        C.claxonNoise = "NOOT NOOT";
//
//        Vehicle noveAuto = new Car();
//        noveAuto.barva = "White";

        Student pepik = new Student();
        pepik.name = "Pepik";
        pepik.age = 76;
        pepik.school = "INFIS";
        pepik.introduce();

        Teacher t = new Teacher();
        t.name = "Honza";
        t.age = 59;
        t.classroom = "3.G";
        t.introduce();
    }
}
