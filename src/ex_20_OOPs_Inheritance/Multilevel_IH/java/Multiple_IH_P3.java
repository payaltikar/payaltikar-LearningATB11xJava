package ex_20_OOPs_Inheritance.Multilevel_IH.java;

public class Multiple_IH_P3 {
    public static void main(String[] args) {


//        Son s1 = new GrandFather(); ---> Not valid
//        Son s1 = new Father();      ---> Not valid
          Son amit = new Son();
        amit.s();
        amit.f();
        amit.gf();
        System.out.println(amit.gold_gf);

        Father f1 = new Father();
        f1.home();

        GrandFather gf1 = new GrandFather();
        gf1.home();


        GrandFather grandFather = new Son();
        grandFather.home();


    }

}
