package Cerven;

public class Student extends Person {
    String school;
//    public Student(String name, int age, String school){
//
//    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("School: " + school);
    }
}
