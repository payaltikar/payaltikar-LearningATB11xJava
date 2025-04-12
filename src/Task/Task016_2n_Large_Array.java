package Task;
import java.util.*;

public class Task016_2n_Large_Array {
    public static void main(String[] args) {
        int[] Marks={90,80,98,96,75};
        Arrays.sort(Marks);
        for(int i=0;i<Marks.length;i++){
            System.out.println(Marks[i]);
        }

        System.out.println("______");
        System.out.println(Marks[Marks.length-2]);
    }

}
