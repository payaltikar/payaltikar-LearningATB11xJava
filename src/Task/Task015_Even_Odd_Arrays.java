package Task;

public class Task015_Even_Odd_Arrays {
    public static void main(String[] args) {
        int[]Num={22,33,42,45,67,89,50};
        int Even=0;
        int Odd=0;
        for(int i=0;i<Num.length-1;i++){
            if(Num[i]%2==0){
                System.out.print("Even: "+ Num[i]+"\t");
            }else{
                System.out.print("Odd: "+ Num[i]+"\t");
            }
        }
    }
}
