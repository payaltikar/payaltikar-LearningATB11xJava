package ex_04_Operators;

public class Lab05_interviewQA {
    public static void main(String[] args) {
        // concatination
//        System.out.println("Pramod"+ "Dutta");

        int a = 10;
        int b = 20;
        System.out.println(a + b); //  // Math

        String name1 = "Pramod ";
        String name2 = "Dutta";
        System.out.println(name1 + name2);

        // + -> behave differently with the data type.
        // + -> operator overloading

        String first_name = "Pramod ";
        String last_name = "Dutta";

        int x = 10;
        int y = 10;

        System.out.println(first_name + last_name + x + y);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(x + y + first_name + last_name);

        System.out.println(first_name + last_name + (x + y));

        // BODMAS - Bracket of Div, mul, add, sub



        // == ?  Compare the values
        System.out.println( 10 == 10);
        System.out.println( 10 < 10);
        System.out.println( 10 == 20);
        System.out.println( 10 >= 10);
    }
}
