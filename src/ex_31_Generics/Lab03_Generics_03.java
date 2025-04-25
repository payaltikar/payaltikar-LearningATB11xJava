package ex_31_Generics;

public class Lab03_Generics_03 {
    public static void main(String[] args) {
        Generic<Integer> I1=new Generic<>(5);
        Generic<String> I2=new Generic<>("tikar");
    }
}
// G--> placeholder(int,string or any other place holder)
 class Generic<G>{
    private G data;
    public Generic(G data){
        this.data=data;
    }
    public G getData(){
        return this.data;
    }
 }