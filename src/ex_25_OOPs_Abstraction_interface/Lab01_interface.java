package ex_25_OOPs_Abstraction_interface;

public class Lab01_interface {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.Gives_Money();

    }
}
interface father{
    void Gives_Money();
}
interface Mother{
    void Gives_Money();
}

class Son implements Mother, father{
    public void Gives_Money(){
        System.out.println("you need to give money by your own");
    }

}
