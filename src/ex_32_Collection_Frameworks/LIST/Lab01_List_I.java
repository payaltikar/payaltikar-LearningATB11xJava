package ex_32_Collection_Frameworks.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab01_List_I {
    public static void main(String[] args) throws Exception {
        List <Integer> A1 = new ArrayList() ;//Dynamic Dispatch
        List <Integer> A2 = new ArrayList() ;//Dynamic Dispatch
        ArrayList <Integer> A3=new ArrayList<>();

        A1.add(2);

        A2.isEmpty() ;
        A3.addFirst(0);

        System.out.println(A1);
    }
}

