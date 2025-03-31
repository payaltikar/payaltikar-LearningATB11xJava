package Task;

import java.util.Scanner;

public class Task008_Fibonacci_series {
    //Fibonacci series --> 1,1,2,3,5,8,13.....
    public static void main(String[] args) {
        System.out.println("Enter a number of term for the fibonnaci series: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int a=0;
        int b=1;
        for(int i=1;i<=num;i++){
            int c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
        }
    }
}
