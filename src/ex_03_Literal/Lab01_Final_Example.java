package ex_03_Literal;

public class Lab01_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature so not able to chang this value
        System.out.println(PI);
    }
}
