package chapter05;

import java.util.Scanner;

public class StringOdd {
    /*5.48 (Process string) Write a program that prompts the user to enter a string and displays
    the characters at odd positions.*/
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(i % 2 == 0) {
                System.out.print(character);
            }
        }

        scanner.close();
    }

}
