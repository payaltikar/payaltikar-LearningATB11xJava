package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab05_SBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
