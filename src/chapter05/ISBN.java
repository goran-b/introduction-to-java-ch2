package chapter05;

import java.util.Scanner;

public class ISBN {
    /* 5.47 (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
    uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
    which is calculated from the other digits using the following formula:
    10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
    If the checksum is 10, replace it with 0. Your program should read the input as a
    string.*/
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN ="";

        do {
            ISBN = scanner.nextLine();
        } while (ISBN.length() != 12);

        for (int i = 0; i < ISBN.length(); i++) {
            char number = ISBN.charAt(i);
            if(i % 2 == 0) {
                int product = (number - 48) * 3;
                sum += product;
            }
            else {
                sum += (number - 48);
            }
        }
        int lastDigit = 10 - sum %10;
        if(lastDigit == 10) {
            lastDigit = 0;
        }


        System.out.print("The ISBN-13 number is " );

        for (int i = 0; i < ISBN.length(); i++) {
            char number = ISBN.charAt(i);
            System.out.print(number);
        }
        System.out.print(lastDigit);
        scanner.close();
    }
}
