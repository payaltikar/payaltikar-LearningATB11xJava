package ex_32_Collection_Frameworks.SET;

import java.sql.SQLOutput;
import java.util.*;

public class Lab02_HS_LHS_TS {
    public static void main(String[] args) {
            Set<String> HS=new HashSet();
            // Hashing mechanism used for storing
            // no order maintain
            // no duplicates and only one null element allowed

        HS.add("payal");
        //HS.add("payal");
        HS.add("tikar");
        HS.add(null);
        //HS.add(null);

        System.out.println(HS.size());
        System.out.println(HS);
        System.out.println("________");


        Set LHS=new LinkedHashSet();
        // Linked list mechanism used for storing
        // order maintain
        // no duplicates and only one null element allowed
            LHS.add("Banana");
            LHS.add("Mango");
            LHS.add("Apple");
            //LHS.add("Apple");
            LHS.add(null);

        System.out.println(LHS.size());
        System.out.println(LHS);
        System.out.println("________");

        Set TS=new TreeSet();
        // Black & red Tree mechanism used for storing
        // order maintain,naturally sorting is done-ASCII char
        // no duplicates
        // null also not allowed
        TS.add("rose");
        TS.add("lotus");
        TS.add("lily");
        //it uses sorting mech so diff. datatype nd null is not allowed
       // TS.add(123);--> ClassCastException
       // TS.add(null);-->NullPointerException
        System.out.println(TS.size());
        System.out.println(TS);
    }
}
