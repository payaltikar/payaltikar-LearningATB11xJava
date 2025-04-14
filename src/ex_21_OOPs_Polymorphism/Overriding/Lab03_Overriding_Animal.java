package ex_21_OOPs_Polymorphism.Overriding;

public class Lab03_Overriding_Animal {
    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
    }


}

class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}
