package ex_16_Arrays_Two_Dimensional;

import java.util.Scanner;

public class Lab04_RightAngle_Traingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] Student_Num = new int[size];
        //int[] marks=new int[3];


        // Use excel sheet for understanding condition and cases between i & j
        System.out.println("_________");

        for (int i = 0; i < Student_Num.length; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
