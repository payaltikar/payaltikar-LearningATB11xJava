package ex_04_Operators;

public class Lab01_Operator {
    public static void main(String[] args) {
        int age = 90;
        // Assignment operator
        // int -> data type
        // age -> identifier
        // 90 -> Literal
        // = -> Assignment operator--->  RHV to the LH

        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c); // 6.666665

        System.out.println("a+b");// here it act as string
        System.out.println(a+b); //here it is act as variables for performing operations
    }
}
