package ex_18_OOPs;

import org.w3c.dom.ls.LSOutput;

public class Lab02_OOP_P2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation
        s1.name="Payal";
        System.out.println(s1.name);
        s1.sleep();
        //s1.salary(500000.00);
        s1.marks(450);

    }

    }

class Student{
    String name;
    int roll;

    void sleep(){
        System.out.println(" I am sleeping now !!");
    }

    int marks(int total){
        return total;
    }

    }

