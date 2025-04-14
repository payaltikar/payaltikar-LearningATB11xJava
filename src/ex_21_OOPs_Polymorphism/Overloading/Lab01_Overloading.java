package ex_21_OOPs_Polymorphism.Overloading;

public class Lab01_Overloading {
    public static void main(String[] args) {
        // Polymorphism means "many forms"
        //Compile time --> same name but diffrent agruments
        // compiler can decide which method he has to use in this case

        //when we give arguments that time itself compiler decided to which method need to call here
        Math m1=new Math();
        m1.add(4,5);
        int r2 = m1.add(3, 4, 9);
        double r3 = m1.add(3.14, 5.46);
        System.out.println(m1.add(4,5));

    }

}
class Math {
// In the same class, When you have a method wit same
// name but different arguments and different return type.


    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}