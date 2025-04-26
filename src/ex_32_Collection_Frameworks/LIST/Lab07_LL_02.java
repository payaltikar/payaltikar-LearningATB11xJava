package ex_32_Collection_Frameworks.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab07_LL_02 {
    public static void main(String[] args) {
        //In arraylist initial capacity should be given and it stores one by one in order
        List mylist1=new ArrayList();

        // In linkedlist initial capacity should not be given and it stores in linked manner not one by one in order
        List mylist2=new LinkedList();

        mylist2.add("1");
        mylist2.add("1");
        mylist2.add("payal");
        mylist2.add(true);
        mylist2.add("tikar");
        mylist2.add(null);
        mylist2.add(0.15);


        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size() );
        System.out.println(mylist2.contains("payal"));
        System.out.println(mylist2.indexOf("tikar"));
        System.out.println(mylist2);


        System.out.println("for printing list in different ways");
        // use for loop
        System.out.println("____for loop____");
        for(int i=0;i<mylist2.size();i++){
            System.out.println(mylist2.get(i));
        }
        //use for each loop
        System.out.println("____for Each loop____");

        for(Object o:mylist2){
            System.out.println(o);
        }
        // we can use iterator also
        System.out.println("____Iterator loop____");

        Iterator iterator=mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
