package Cerven;

public class Teacher extends Person{
    String classroom;

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Učím třídu " + classroom);
    }
}
