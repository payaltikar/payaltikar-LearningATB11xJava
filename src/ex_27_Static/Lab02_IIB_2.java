package ex_27_Static;

public class Lab02_IIB_2 {
    public static void main(String[] args) {

        new A1();
    }
}
class A1{
    A1(){
        System.out.println("DC");
    }
    {

        System.out.println("Hi, I'm IIB");
        System.out.println("if u want to excute or call something when object is created");
    }
    {
        System.out.println("Hi, I'm IIB2");
    }
    {
        System.out.println("Hi, I'm IIB2");
    }
    {
        System.out.println("Hi, I'm IIB3");
    }
}