package chapter06;

import java.util.Scanner;

public class FormatAnInteger {
    /*6.37
    (Format an integer) Write a method with the following header to format the inte-
    ger with the specified width.
    public static String format(int number, int width)
    The method returns a string for the number with one or more prefix 0 s. The size
    of the string is the width. For example, format(34, 4) returns 0034 and for-
    mat(34, 5) returns 00034 . If the number is longer than the width, the method
    returns the string representation for the number. For example, format(34, 1)
    returns 34 .Write a test program that prompts the user to enter a number and its width and
    displays a string returned by invoking format(number, width) .
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println (format(number,width));
    }
    public static String format(int number, int width){
        String formated="";
        String numInString="";
        numInString+=number;

        for (int i=0;i<width-numInString.length();i++){
            formated+=0;
        }
        formated+=number;

        return formated;
    }

}
