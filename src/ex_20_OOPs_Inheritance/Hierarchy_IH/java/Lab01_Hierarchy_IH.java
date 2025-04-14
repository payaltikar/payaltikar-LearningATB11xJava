package ex_20_OOPs_Inheritance.Hierarchy_IH.java;

public class Lab01_Hierarchy_IH {
    //Hierarchy IH mean one or more children can inherit properties from his parent class/superclass
    public static void main(String[] args) {
        Father_Home f1=new Father_Home();
        f1.Home();

        shubhangi s1=new shubhangi();
        s1.Home();
        s1.H1();

        Kishor k1=new Kishor();
        k1.H2();
        k1.Home();

        Nilesh n1=new Nilesh();
        n1.H3();
        n1.Home();

    }
}
class Father_Home{
    void Home(){
        System.out.println("Having 1bhk");
    }
}

class shubhangi extends Father_Home{
    void H1(){
        System.out.println("Having 3bhk");
    }
}
class Kishor extends Father_Home{
    void H2(){
        System.out.println("Having 2bhk");
    }
}
class Nilesh extends Father_Home{
    void H3(){
        System.out.println("Having 2bhk");
    }
}
