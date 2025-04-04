package ex_07_Increment_Decrement_operator;

public class Lab06_ID3_OP {
    public static void main(String[] args) {
        //Example 1
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // A+B -> ExpA+ExpB -> 10+12 -> 22 , a -> 12

        //Example 2
        int b = 10;
        int result_post = a--;
        System.out.println(result_post); // 10
        System.out.println(b); //9

        //Example 3
        int c= 10;
        int result = --c; // 9
        System.out.println(result);
        System.out.println(c); // 9
    }
}
