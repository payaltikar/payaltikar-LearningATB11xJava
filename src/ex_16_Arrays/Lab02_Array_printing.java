package ex_16_Arrays;
import java.util.*;

public class Lab02_Array_printing {
    public static void main(String[] args) {

        int [] Marks={70,80,97,56,45,50};
        // printing an element of array
        System.out.println(Marks[0]);

        //for printing each and every element of array
        for(int i=0;i<Marks.length;i++) {
            System.out.println(Marks[i]);}

            //System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException
            //System.out.println(marks[10]); // .ArrayIndexOutOfBoundsException
        System.out.println("___________Sorted___________");
            Arrays.sort(Marks);

            for(int i=0;i<Marks.length;i++) {
                System.out.println(Marks[i]);}

            char c = 'A';
            String name = "pramod";
        }
    }


