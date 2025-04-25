package ex_32_Collection_Frameworks.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab03_Arraylist{
    public static void main(String[] args) {
        ArrayList  A1=new ArrayList();
        A1.add("payal");
        A1.add(123);
        A1.add(0.0090);
        A1.add(false);
        A1.add("payal");
        System.out.println(A1);
        System.out.println(A1.size());

        List list =new ArrayList();
        list.add(123);
        list.add("p");
        list.add(123.675);
        System.out.println(list);
        System.out.println(list.isEmpty());


    }
}
