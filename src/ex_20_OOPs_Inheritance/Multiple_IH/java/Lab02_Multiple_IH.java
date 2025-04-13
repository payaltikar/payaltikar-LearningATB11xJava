package ex_20_OOPs_Inheritance.Multiple_IH.java;

public class Lab02_Multiple_IH {
    public static void main(String[] args) {

//        Java does not support multiple inheritance (where a class can inherit from more than one parent class) to avoid the "diamond problem" and keep the language simple and maintainable.
//
//                Why No Multiple Inheritance in Java?
//                Diamond Problem (Ambiguity Issue)
//
//        If a class inherits from two parent classes that have the same method, Java wouldn’t know which one to call.

    }
}
class Father_MP {
    void money(){
        System.out.println("1 CR");
    }

    void home(){}
}
class Mother_MP {
    void money(){
        System.out.println("1.5 CR");
    }

    void home(){}
}

class Son //extends Mother_MP, Father_MP{
{

    // You can't have multiple inheritance
    // You can't take from multiple people - classes

}