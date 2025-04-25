package ex_31_Generics;

public class Lab02_Generics_02 {
    public static void main(String[] args) {
        temp_result(3,4);
        temp_result(3.6,1.4);
        temp_result("payal"," tikar");
    }
    static <G> G temp_result(G a,G b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
