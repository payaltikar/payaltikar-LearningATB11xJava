package Task;
import java.util.*;
public class Task011_Palindome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name then I'll check it is palindrome or not?  : ");
        String Name = sc.next();

        String Rev = "";
        for (int i = Name.length() - 1; i >= 0; i--) {
            Rev += Name.charAt(i);
        }
        if (Name.equals(Rev)) {
            System.out.println("Palindrome!!");
        } else {
            System.out.println("Not a palindrome");

        }
    }
}


