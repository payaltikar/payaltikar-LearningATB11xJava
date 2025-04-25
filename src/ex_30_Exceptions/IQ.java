package ex_30_Exceptions;

public class IQ {
    public static void main(String[] args) {
        try {
            String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsExceptio
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100/a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }

// second scenario
        int c =0;
        int b = 0;
        try {
            b = 10/c; // Vulnerable Code that should be try and catch!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

}
