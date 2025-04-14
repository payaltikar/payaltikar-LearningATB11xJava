package ex_21_OOPs_Polymorphism.Overriding;

public class Lab01_Overriding {
    public static void main(String[] args) {

        // Polymorphism means "many forms"
        // Runtime time --> child class can overriding the method of parentclass--->rel between child nd parent class
        // at runtime it can decide which method is useful in this case

        Son s1=new Son();
        s1.Home();
    }
}

class Father{
    void Home(){
        System.out.println("1bhk ");
    }
}
class Son extends Father{
    @Override
    void Home(){
        System.out.println("2bhk ");
    }
}