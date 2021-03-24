package chapther4;

import java.util.Scanner;

public class VowelOrConsonant {
    /*4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and
    check whether the letter is a vowel or consonant.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an letter: ");
        char input = scanner.next().toLowerCase().charAt(0);
        if (input == 'a' ||
                input == 'e' ||
                input == 'i' ||
                input == 'o' ||
                input == 'u') {
            System.out.println(input + " is vowel");
        } else if (input >= 'a' && input <= 'z') {
            System.out.println(input + " is consonant");
        } else {
            System.out.println(input + " is invalid input");
        }
    }
}
