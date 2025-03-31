package Task;
import java.util.*;

public class Guess_num {
    public static void main(String[] args) {

        Random random=new Random();
        int Num=random.nextInt(100)+1;
        int attempts=0;

        while(true){
            System.out.println("Guess a number");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            attempts++;
            if(guess>Num){
                System.out.println("Too big, try again!! ");
            }
            else if(guess<Num){
                System.out.println("smaller one, plzz try again!! ");
            }
            else{
                System.out.println("congratulations!! you guess correct number in "+ attempts +" Attempts ");
                break;
            }
        }

    }

}
