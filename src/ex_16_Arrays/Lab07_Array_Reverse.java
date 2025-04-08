package ex_16_Arrays;

import java.util.Scanner;

public class Lab07_Array_Reverse {
    public static void main(String[] args) {
        //if array is predefined
        int[] Marks = {70, 80, 97, 56, 45, 50};

        for (int i = Marks.length - 1; i >=0; i--) {
            System.out.println(Marks[i]);
        }

        // if array is not predefined---> user defined input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        String[] Student_Names = new String[size];
        //int[] marks=new int[3];
        for (int i = 0; i < Student_Names.length; i++) {
            System.out.println("Enter elements in the array: ");
            Student_Names[i] = sc.next();
        }


        for (int i = Student_Names.length- 1; i >=0; i--) {
            System.out.println(Student_Names[i]);
        }

    }
}

