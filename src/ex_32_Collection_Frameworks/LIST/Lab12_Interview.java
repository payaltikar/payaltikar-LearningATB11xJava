package ex_32_Collection_Frameworks.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab12_Interview {
    public static void main(String[] args) {
        List Marks=new ArrayList() ;
        Marks.add(90);
        Marks.add(80);
        Marks.add(95);
        Marks.add(70);
        Marks.add(45);

        System.out.println(Marks);
        System.out.println("_______");
        Collections.sort(Marks);
        //collection--> interface
        //collections--> it is a class with some functions
        System.out.println(Marks);
        System.out.println("______");
        Collections.sort(Marks,Collections.reverseOrder());
        System.out.println(Marks);
    }
}
