package ex_10_For_Loops;

public class Lab12_For_Loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            if (i == 5) {
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
