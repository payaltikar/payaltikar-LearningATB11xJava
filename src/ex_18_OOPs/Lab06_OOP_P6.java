package ex_18_OOPs;

public class Lab06_OOP_P6 {
    public static void main(String[] args) {
        Human Payal =new Human();
        Payal.Salary= 3500000.00;
        Payal.Age=23;
        Payal.Job(3500000);

    }

}

class Human{
    String Name;
    Byte Age;
    Double Salary;

    void talk(){
        System.out.println("Talking");
    }

    double Job(double Salary){
        return Salary;
    }

    boolean Is_Married(boolean TF){
        return TF; }

}