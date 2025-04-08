package ex_16_Arrays;

public class Lab08_Sum_of_Array {
    public static void main(String[] args) {

        int [] Marks={70,80,97,56,45,50};
        // Using For loop
        int sum=0;
        for(int i=0;i<Marks.length;i++){
            sum=sum+Marks[i];
        }
        System.out.println(sum);

        System.out.println("______________");
        //Using For each loop
        int sum1=0;
        for(int n:Marks){
            sum1=sum1+n;
        }
        System.out.println(sum1);
    }
    }

