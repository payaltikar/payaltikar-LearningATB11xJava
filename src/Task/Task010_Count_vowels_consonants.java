package Task;

import java.util.Scanner;

public class Task010_Count_vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plzz  : ");
        String Name = sc.next();
        Name=Name.toLowerCase();
        int vowel = 0;
        int consonants = 0;
        for(int i=0;i<Name.length();i++){
            if(Name.charAt(i)=='a' ||Name.charAt(i)=='e' ||Name.charAt(i)=='i' ||Name.charAt(i)=='o'||Name.charAt(i)=='u'){
                vowel++;
            }else{
                consonants++;
            }
        }
        System.out.println("In this Case"+ vowel+ " vowels are there and "+ consonants+ " consonants are there");
    }
}