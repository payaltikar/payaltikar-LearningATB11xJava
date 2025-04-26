package ex_32_Collection_Frameworks.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab09_vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("payal");
        v.add("tikar");
        v.add(45);
        v.add(null);

        v.remove(null);
        System.out.println("_________");
        // we can use iterator also
        System.out.println("____Iterator loop____");

        Iterator iterator = v.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        // we can use Enemuration for vectors
        System.out.println("____Enemuration loop____");

        Enumeration<Object> enumeration=v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


    }
}