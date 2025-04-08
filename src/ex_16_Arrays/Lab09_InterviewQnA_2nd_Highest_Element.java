package ex_16_Arrays;
import java.util.Arrays;


public class Lab09_InterviewQnA_2nd_Highest_Element {
    public static void main(String[] args) {
        int [] Marks={70,80,97,56,45,50};
        Arrays.sort(Marks);
        for(int i=0;i<Marks.length;i++){
            System.out.println(Marks[i]);
        }
        System.out.println("___________");
        System.out.println(Marks[Marks.length-1]);
        System.out.println(Marks[Marks.length-2]);

//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);
//        System.out.println(numbers[numbers.length-3]);

    }
}
