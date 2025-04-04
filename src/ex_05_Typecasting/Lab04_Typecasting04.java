package ex_05_Typecasting;

public class Lab04_Typecasting04 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?---> Not valid
        short s = (short) phone_no; // Explicit Casting - Narrowing--->valid
        System.out.println(s);}
}