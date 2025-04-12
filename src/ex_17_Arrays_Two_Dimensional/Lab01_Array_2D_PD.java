package ex_17_Arrays_Two_Dimensional;

public class Lab01_Array_2D_PD {
    public static void main(String[] args) {
        int[][] array = { {25,14,56},{15, 36,56},{77,18,29} };

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" |");
            }
            System.out.println( );
        }

    }
}
