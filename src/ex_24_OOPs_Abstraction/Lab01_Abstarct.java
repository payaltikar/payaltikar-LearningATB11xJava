package ex_24_OOPs_Abstraction;

public class Lab01_Abstarct {
    public static void main(String[] args) {
    son s1=new son();
    s1.loan();
    }
}

abstract class Father{
    //abstract mean public void methos
    //which is not defined,it should be defined by its subclasss
    abstract void loan();

}

class son extends Father{


    private String Name;
    private byte age;

    void loan(){
        System.out.println("have to give loan");
    }


}