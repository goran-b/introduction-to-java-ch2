package chapter04;

import java.util.Scanner;

public class StudentMajorAndStatus {
    /*4.18 (Student major and status) Write a program that prompts the user to enter two
    characters and displays the major and status represented in the characters. The first
    character indicates the major and the second is number character 1, 2, 3, 4, which
    indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
    the following chracters are used to denote the majors:
    M: Mathematics
    C: Computer Science
    I: Information Technology*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String input = scanner.nextLine();
        String output = "";

        if (input.length() > 2 || input.length() == 0) {
            System.out.println("Invalid input!");
            return;
        }
        if (input.charAt(0) == 'M') output += "Mathematics ";
        else if (input.charAt(0) == 'C') output += "Computer Science ";
        else output += "Information Technology ";

        if (input.charAt(1) == '1') output += "Freshman";
        else if (input.charAt(1) == '2') output += "Sophomore";
        else output += "Junior";

        System.out.println(output);
    }
}
