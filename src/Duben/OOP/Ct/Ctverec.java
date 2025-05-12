package Duben.OOP.Ct;

public class Ctverec {
    double delkaStrany;

    public Ctverec(double value){
        if (value < 0.0){
            return;
        }
        delkaStrany = value;
    }
}
