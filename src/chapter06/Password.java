package chapter06;

import java.util.Scanner;

public class Password {
    /* 6.18 (Check password ) Some websites impose certain rules for passwords. Write a
    method that checks whether a string is a valid password. Suppose the password
    rules are as follows:
    A password must have at least eight characters.
    A password consists of only letters and digits.
    A password must contain at least two digits.
    Write a program that prompts the user to enter a password and displays Valid
    Password if the rules are followed or Invalid Password otherwise.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String input = scanner.next();
        checkPasword(input);
    }

    public static void checkPasword(String pass) {
        if (isValidLenght(pass) && isValidOnlyLetteraAndDigits(pass) && isValidHasTwoDigits(pass))
            System.out.println("Valid password");
        else System.out.println("Invalid Password");
    }

    private static boolean isValidLenght(String pass) {
        if (pass.length() >= 8) return true;
        return false;
    }

    private static boolean isValidOnlyLetteraAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))) return false;
        }
        return true;
    }

    private static boolean isValidHasTwoDigits(String pass) {
        int digitsCounter = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) digitsCounter++;
        }
        if (digitsCounter > 1) return true;
        return false;
    }

}
