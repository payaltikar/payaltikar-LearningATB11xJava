package ex_03_Literal;

public class Lab06_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string if you are putting it in double string.
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("payalTikar");
        System.out.println("payal"+new_line+"Tikar");
        System.out.println("payal"+tab_line+"Tikar");
        System.out.println("payal"+back_space+"Tikar");
        System.out.println("payal is old"+carriage_return+"Tikar");


        System.out.println("Hi,\nThis is a First line"+new_line+"This is second line\nThis is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
    }
}
