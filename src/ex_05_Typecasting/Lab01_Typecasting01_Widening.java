package ex_05_Typecasting;

public class Lab01_Typecasting01_Widening {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening

        int a1 = (int)b; // Valid syntax -> smaller data into the bigger data type
        // Explicit - Casting - Widening

    }
}