package ex_10_For_Loops;

public class Lab03_For_Loop_Var_Name {
    public static void main(String[] args) {
        //Example--1--->variable name also valid
        for (int aditi = 0; aditi < 10; aditi++) {
            System.out.println(aditi);


            //example--2---> spl character like underscore and digit also valid
            for (int _1 = 0; _1 <= 10; _1++) { // 11 times
                System.out.println(_1); // 0, to 10
            }
        }
    }
}

