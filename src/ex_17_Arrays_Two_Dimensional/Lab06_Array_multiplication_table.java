package ex_17_Arrays_Two_Dimensional;

import java.util.Scanner;

public class Lab06_Array_multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array_2D: ");
        int s1=sc.nextInt();
        int[] array_2D=new int[s1];

        System.out.println("__________");

        for(int i=0;i<s1;i++){
            for(int j=0;j<s1;j++){

               // System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");
                System.out.print((i * j) + "\t");
            }
            System.out.println( );
        }
    }

}
