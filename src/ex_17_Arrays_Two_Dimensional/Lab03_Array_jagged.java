package ex_17_Arrays_Two_Dimensional;

// Jagged Array every row has diffrent elements

public class Lab03_Array_jagged {
    public static void main(String[] args) {
        int[][] array = {   {25,14},
                            {15, 36,56,40},
                            {77,18,29} };

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" |");
            }
            System.out.println( );
        }
    }
}
