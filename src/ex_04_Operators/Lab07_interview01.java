package ex_04_Operators;

public class Lab07_interview01 {
    public static void main(String[] args) {
        //first
        System.out.println(!(10>20));

        //second
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false

        //Third
        int x = 10;
        boolean y = (10 == 11); // == -> Comparison 2 values
        System.out.println(x);
        System.out.println(y);

        //Fourth
        long l = 10l; // 8 Byte, 64 Bits
        String s = "name"; //  8 Byte, 64 Bits

        //Fifth
        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1 + b1);
        // a1+b1 - 65+66 -> 131

        //Sixth
        System.out.println('A' == 65);

        //Seventh
        short sh = 10;
        char c = 'A';//65
        System.out.println(c+sh);
    }
}
