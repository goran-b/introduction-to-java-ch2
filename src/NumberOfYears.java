import java.util.Scanner;

public class NumberOfYears {
    /*
    * *2.7
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
*  For simplicity, assume a year has 365 days.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int input = scanner.nextInt();
        int years, days, minutes;
        minutes = input;
        years = minutes / (60 * 24 * 365);
        minutes %= (60 * 24 * 365);
        days = minutes / (60 * 24);
        System.out.println(input + " minutes is approximately " + years + " years and " + days + " days ");
    }

}
