package ex_18_OOPs;

public class Lab07_OOP_Cat {
    public static void main(String[] args) {
        Cat c1=new Cat();
        Cat c2;
        new Cat();

        c1.running();
        new Cat().running();
    }
}

class Cat {
    String name; // null

    void running() {
        System.out.println("Running");
    }
}