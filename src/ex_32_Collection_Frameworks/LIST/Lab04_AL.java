package ex_32_Collection_Frameworks.LIST;
import java.util.ArrayList;
import java.util.List;

public class Lab04_AL {
    public static void main(String[] args) {
        List l=new ArrayList();
       // List l=new ArrayList(20);
        // if you not given capacity here then its default capacity is 10
        l.add(5);
        l.add(9);
        l.add(7);
        l.add(2);
        l.add(2);
        l.add("desh");
        // if you use List l<Integer>=new ArrayList();
        // means you are restricting it to use single Integer data types only
        // if you are not using this means it allows to use any data type in list / arraylist

        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("5"));
        System.out.println(l.contains(5));
        //Returns the index of the last occurrence of the specified element in the list
        System.out.println(l.indexOf(2));
        System.out.println(l.lastIndexOf(2));

        System.out.println(l);
        System.out.println("___________");
       for(int i=0;i<l.size();i++){
           System.out.println(l.get(i));
       }


    }
}
