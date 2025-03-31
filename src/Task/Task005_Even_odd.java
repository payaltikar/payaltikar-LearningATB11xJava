package Task;

import java.util.Scanner;

public class Task005_Even_odd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();

        if(Num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("odd Number");

        }
    }
}