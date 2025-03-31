package ex_01_Java_Basic;

public class Can_we_use_multiple_main_methods_in_programmes {

    // main() method is entry pt. of java aplliction
    // yes, we can create multiple main methods but only one will recognize by java
    // try by running below code

    public static void main(String[] args){
        System.out.println("Ganpati bappa morya ");
    }
    public static void main(String args){
        System.out.println("Hii ");
    }
    public static void main(Integer args){
        System.out.println("Bye ");
    }


}
