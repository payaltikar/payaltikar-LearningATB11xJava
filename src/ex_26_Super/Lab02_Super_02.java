package ex_26_Super;

public class Lab02_Super_02 {
    public static void main(String[] args) {

    }
}
class GOD{
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends GOD{
    protected  String color  = "white";


    void sound(){
        System.out.println("Animal Sound!");
        super.sound();
    }

}

class Dog extends Animal{

    private String color  = "Black";

    Dog(){
        //super();
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }

}