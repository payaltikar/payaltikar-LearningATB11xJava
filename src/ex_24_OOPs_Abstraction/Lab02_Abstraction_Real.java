package ex_24_OOPs_Abstraction;

public class Lab02_Abstraction_Real {
    public static void main(String[] args) {
        C1 ref=new C1();
        ref.computePay();
        ref.mailCheck();

    }
}
abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }


}

class C1 extends Employee{


    @Override
    double computePay() {
        return 0;
    }
}