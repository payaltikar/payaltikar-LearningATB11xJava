package ex_32_Collection_Frameworks.LIST;

import java.util.ListIterator;
import java.util.Vector;

public class Lab10_Listiterator_Reverse {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("payal");
        v.add("tikar");
        v.add(45);
        v.add(null);

        System.out.println("____list Iterator_____");

        ListIterator ll=v.listIterator();
        while(ll.hasNext()){
            System.out.println(ll.next() );
        }

        System.out.println("____list Iterator_reverse function_____");

        while(ll.hasPrevious()){
            System.out.println(ll.previous());
        }
    }
}
