import java.util.Scanner;

public class SumDigitsInInteger {
    /*
     * **2.6
     * (Sum the digits in an integer) Write a program that reads an integer between 0 and
     * 1000 and adds all the digits in the integer. For example, if an integer is 932 , the
     * sum of all its digits is 14 .
     * Hint: Use the % operator to extract digits, and use the / operator to remove the
     * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93 .
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: 999");
        int number=scanner.nextInt();
        int sumOfDigits=number%10;
        number/=10;
        sumOfDigits+=number%10;
        number/=10;
        sumOfDigits+=number%10;
        number/=10;
        System.out.println("The sum of the digits is 27 "+sumOfDigits);


    }

}
