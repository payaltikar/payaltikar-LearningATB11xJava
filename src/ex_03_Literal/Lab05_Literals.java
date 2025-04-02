package ex_03_Literal;

public class Lab05_Literals {
    public static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10
        System.out.println(age);

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10
        System.out.println(binary_num);

        // Octal base? -> 8
        int octal = 0101;
        System.out.println(octal);

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        System.out.println(hex);
    }
}
