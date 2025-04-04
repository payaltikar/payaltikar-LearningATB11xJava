package ex_06_Ternary_Operator;

public class Lab01_TO1 {
    public static void main(String[] args) {
        //first
        // ? :
        int age = 10;
        String canIVote  =  10 >=18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote);

        //second
        // result = condition ? expression1 : expression2;
        int number = 5;
        String resule = number > 0 ? "Positive" : "Negative";
        System.out.println(resule);

    }
}
