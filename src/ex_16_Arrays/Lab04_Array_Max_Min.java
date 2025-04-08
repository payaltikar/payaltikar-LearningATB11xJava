package ex_16_Arrays;

public class Lab04_Array_Max_Min {
    public static void main(String[] args) {
        int [] Marks={70,80,97,56,45,50};
        int max=Marks[0];

        for(int i=0;i<Marks.length;i++) {
            if (max < Marks[i]) {
                max = Marks[i];
            }
        }
        System.out.println(max);
    }
}
