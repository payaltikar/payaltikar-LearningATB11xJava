package ex_05_Typecasting;

public class Lab03_Typecasting03_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte) val; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b2);
    }
}