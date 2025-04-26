package ex_32_Collection_Frameworks.LIST;


import java.util.LinkedList;
import java.util.List;

public class Lab06_LL_Animal {
    public static void main(String[] args) {
        List<String> Animal=new LinkedList();
        Animal.addFirst("Lion");
        Animal.add("Dog");
        Animal.add("Cat");
        Animal.add("Horse");
        Animal.addLast("Elephant");
        System.out.println("________");
        System.out.println(Animal);

        Animal.getFirst();
        Animal.getLast() ;
        Animal.getClass() ;

        Animal.remove("Cat") ;
        System.out.println( Animal.isEmpty());
        System.out.println(Animal);
    }
}
