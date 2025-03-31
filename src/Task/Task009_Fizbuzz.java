package Task;
import java.util.*;

public class Task009_Fizbuzz {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();

        if(Num%3==0 && Num%5==0){
            System.out.println("FizzBuzz");
        }else if(Num%5==0){
            System.out.println("Buzz");
        }else if(Num%3==0){
            System.out.println("Fizz");
        }else{
            System.out.println("Nothing");

        }
    }
}
