package ex_17_Arrays_Two_Dimensional;

import java.util.Scanner;

public class Lab05_LeftAngle_Traingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] Num = new int[size];
        //int[] marks=new int[3];


        // Use excel sheet for understanding condition and cases between i & j
        System.out.println("_________");

        for (int i = Num.length; i >=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
