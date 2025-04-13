package ex_20_OOPs_Inheritance.Multilevel_IH.java;

public class Multiple_IH_P2 {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amit = new Son();

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();



        GrandFather g2 = new Father();
        g2.home();


        Father f2 = new Son();
        f2.home();
        // Father f3 = new GrandFather();

        // WebDriver driver = new ChromeDriver();
    }

}
