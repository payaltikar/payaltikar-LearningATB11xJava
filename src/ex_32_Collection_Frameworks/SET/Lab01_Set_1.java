package ex_32_Collection_Frameworks.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab01_Set_1 {
    public static void main(String[] args) {
        Set Hs=new HashSet();
        Set Ls=new LinkedHashSet();
        Set Ts=new TreeSet();

        Hs.add("Payal");
        //Duplicate elements are not allowed
        //Hs.add("Payal");
        Hs.add("Tikar");
        System.out.println(Hs);

    }
}
