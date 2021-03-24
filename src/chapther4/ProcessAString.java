package chapther4;

import java.util.Scanner;

public class ProcessAString {
    /*4.20 (Process a string) Write a program that prompts the user to enter a string and displays
    its length and its first character.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("String lenght: "+input.length() +". First char: "+input.charAt(0));
    }
}
