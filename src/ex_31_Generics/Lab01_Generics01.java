package ex_31_Generics;

public class Lab01_Generics01 {
    public static void main(String[] args) {
        temp_result(3,4);
        temp_result(3.6,1.4);
        temp_result("payal"," tikar");
        System.out.println( temp_result(3,4));
        System.out.println( temp_result(3.6,1.4));
        System.out.println( temp_result("payal"," tikar"));
    }

    static int temp_result(int a,int b){
        return a+b;
    }
    static double temp_result(double a,double b){
        return a+b;
    }
    static String temp_result(String a,String b){
        return a+b;
    }
}

