package ex_32_Collection_Frameworks.LIST;
import java.util.*;

public class Lab02_List {
    public static void main(String[] args) {
        List fruits=List.of("orange","banana","apple") ;
        // fruits.add("mango");--> .UnsupportedOperationException
        System.out.println(fruits);


        List A1=new ArrayList();
        ArrayList A2=new ArrayList();

        A1.add("chiku");
        A2.addFirst(0);
        A2.add("payal");
        A2.add(true);
        A2.add(3.14);
        System.out.println(A1);
        System.out.println(A2);
    }
}
