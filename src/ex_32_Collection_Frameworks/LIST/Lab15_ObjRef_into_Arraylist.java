package ex_32_Collection_Frameworks.LIST;

import java.util.*;

public class Lab15_ObjRef_into_Arraylist {
    public static void main(String[] args) {
        Students s1=new Students("payal",12);
        Students s2=new Students("sonu",11);
        Students s3=new Students("Monu",12);

       List Mystudent=new ArrayList();
       Mystudent.add(s1);
       Mystudent.add(s2);
       Mystudent.add(s3);

        System.out.println(Mystudent);



    }
}
