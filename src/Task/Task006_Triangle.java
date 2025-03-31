package Task;
import java.util.*;

public class Task006_Triangle {
    public static void main(String[] args) {

        System.out.println("Enter First side of traingle:  " );
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        System.out.println("Enter Second side of traingle:  " );
        int side2=sc.nextInt();
        System.out.println("Enter Third side of traingle:  " );
        int side3=sc.nextInt();
        // write Edge cases also
        if(side1+side2<side3 || side1+side3<side2 || side2+side3<side1){
            System.out.println("It is not a traingle");
        }else if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("It is not a traingle");
        }else if(side1==side2 || side2==side3|| side1==side3){
            System.out.println("Isoscalen traingle");
        }else if(side1==side2 && side2==side3){
            System.out.println("Equilateral traingle ");
        }else {
            System.out.println("Scalen");
        }
    }
}
