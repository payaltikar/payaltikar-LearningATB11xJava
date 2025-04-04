package ex_06_Ternary_Operator;

public class Lab03_TO2 {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        //System.out.println(Math.max(x,y));

        int min = x < y ? x : y;
        System.out.println(min);


    }
}
