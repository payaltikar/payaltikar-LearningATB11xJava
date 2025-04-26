package ex_32_Collection_Frameworks.LIST;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Lab11_nestedArraylist {
    public static void main(String[] args) {
        List fruit=new ArrayList();
        List flower=new ArrayList();
        List vegies=new ArrayList();

        fruit.add("mango");
        fruit.add("apple");
        fruit.add("berry");
        flower.add("rose");
        flower.add("lotus");
        flower.add("lily");

        List All_In_One=new ArrayList();
        All_In_One.add(fruit);
        All_In_One.add(flower);

        System.out.println(All_In_One);
        System.out.println(All_In_One.get(1));
    }
}
