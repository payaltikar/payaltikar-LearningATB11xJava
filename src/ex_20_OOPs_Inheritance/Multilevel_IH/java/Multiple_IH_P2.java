package ex_20_OOPs_Inheritance.Multilevel_IH.java;

public class Multiple_IH_P2 {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();  ---> Not valid
//        Son s1 = new Father();       ---> Not valid
        Son amit = new Son();

        GrandFather g1 = new Son(); // Dynamic Dispatch--> gf is present at the time when new son borned.
        g1.gf();
        g1.home(); //whose object is created those behaviour(function) will be called

        GrandFather g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();
        // Father f3 = new GrandFather(); ---> Not valid

        // WebDriver driver = new ChromeDriver();
    }

}
