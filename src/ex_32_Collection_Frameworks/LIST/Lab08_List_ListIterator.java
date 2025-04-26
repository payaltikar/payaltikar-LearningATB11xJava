package ex_32_Collection_Frameworks.LIST;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;


public class Lab08_List_ListIterator {
    public static void main(String[] args) {
        List list=new LinkedList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add(3);
        list.add("Payal");
        list.add("tikar");

        // For List interface there is concept called list iterator
        //it has a spl function it can revert the list

        System.out.println("____list Iterator_____");

        ListIterator ll=list.listIterator();
        while(ll.hasNext()){
            System.out.println(ll.next());
        }
    }
}
