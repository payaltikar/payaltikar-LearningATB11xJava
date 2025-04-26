package ex_32_Collection_Frameworks.LIST;

import java.util.Stack;

public class Lab14_Stack {
    public static void main(String[] args) {
        Stack s=new Stack();
        // Stack follows last in fisrt out str(LIFO)
        s.add("1");
        //instead of add here we can use push add
        // pop for removal
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");
        System.out.println(s);
        s.pop() ;
        System.out.println(s);
        System.out.println(s.peek());

    }
}
