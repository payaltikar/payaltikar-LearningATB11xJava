package ex_27_Static;

public class Lab04_Static_01 {
    public static void main(String[] args) {

        A11 ref1 = new A11(10);
        ref1.displayValue();
//        System.out.println(ref1.b);
        System.out.println(A11.b);
        A11.b = 45;

        System.out.println(" --- ");

        A11 ref2 = new A11(20);
        ref2.displayValue();
//        System.out.println(ref2.b);
        System.out.println(A11.b);

        System.out.println(" --- ");


        A11 ref3 = new A11(20);
        System.out.println(A11.b);

    }

}

class A11{

    int a; // non static -> instance variable / properties/ attribute / fields
    static int b = 20;

    A11(int a) {
        this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
    }





}
