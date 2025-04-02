package ex_04_Operators;

public class Lab02_Operators2 {
    public static void main(String[] args) {
        // Unary Operator
        int a = +10;
        int a1 = -110;
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);


        int b = -1;
        b = b+1;
        System.out.println(b);


        int x = 20;
        int y = 10;
        System.out.println(x%y);
        // Mod -> Remainder,
//        10 | 20 |  2 - Quoinet
//           | 20 |
//           -------
//             0 - Remainder
//           ----

        System.out.println(13%7);
        // Mod -> Remainder,
//        7 | 13 |  2 - Quoinet
//          |  7 |
//           -------
//             6 - Remainder
//           ----
    }
}
