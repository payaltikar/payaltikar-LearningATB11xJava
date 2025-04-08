package ex_16_Arrays;
import java.util.*;

public class Lab06_Array_User_Input {
    public static void main(String[] args) {

        // Can we take input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        String[] Student_Names = new String[size];
        //int[] marks=new int[3];
        for (int i = 0; i < Student_Names.length; i++) {
            System.out.println("Enter elements in the array: ");
            Student_Names[i] = sc.next();
        }

        System.out.println("_________");

        for (int i = 0; i < Student_Names.length; i++) {
            System.out.println(Student_Names[i]);

        }
    }
}
