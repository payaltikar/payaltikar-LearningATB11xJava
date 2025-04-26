package ex_32_Collection_Frameworks.LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab13_User_input_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<String> name=new ArrayList();
        List<Integer> age=new ArrayList();

        String CInuput="Y";
        while(CInuput.equalsIgnoreCase("y") ){
            System.out.println("enter name plz:  ");
            name.add(sc.next());

            System.out.println("enter your age plz:  ");
            age.add(sc.nextInt());

            sc.nextLine();
            System.out.println("Do you want to add more user(Y/N) ");
            CInuput=sc.nextLine() ;

        }

        for(Object o: name){
            System.out.println(o);
        }
        for(Object o: age){
            System.out.println(o);
        }

        sc.close();
    }
}
