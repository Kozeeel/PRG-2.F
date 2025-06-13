package Cerven;

public class Teacher extends Person{
    String classroom;

    public void introduce(){
        super.introduce();
        System.out.println("Učím třídu " + classroom);
    }
}
