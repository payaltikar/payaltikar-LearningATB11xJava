package ex_16_array_2Ds_Two_Dimensional;
import java.util.*;

public class Lab02_Array_2D_UD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array_2D: ");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int[][] array_2D=new int[s1][s2];


        for(int i=0;i<array_2D.length;i++){
            for(int j=0;j<array_2D[i].length;j++){
                System.out.println("Enter iems in array: ");
               array_2D[i][j]=sc.nextInt();
            }
        }
        System.out.println("__________");

        for(int i=0;i<array_2D.length;i++){
            for(int j=0;j<array_2D[i].length;j++){
                System.out.print(array_2D[i][j]+" |");
            }
            System.out.println( );
        }
    }
}
