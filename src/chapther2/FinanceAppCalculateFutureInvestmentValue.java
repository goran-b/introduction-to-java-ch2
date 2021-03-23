package chapther2;

import java.util.Scanner;

public class FinanceAppCalculateFutureInvestmentValue {
    /*
     **2.21
    (Financial application: calculate future investment value) Write a program that
    reads in investment amount, annual interest rate, and number of years, and dis-
    plays the future investment value using the following formula:
    futureInvestmentValue =
    investmentAmount * (1 + monthlyInterestRate) numberOfYears*12
    For example, if you enter amount 1000 , annual interest rate 3.25% , and number
    of years 1 , the future investment value is 1032.98
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter investment amount: 1000.56");
        double investmentAmount=scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage: 4.25");
        double annualInterestRate=scanner.nextDouble()/100;
        double monthlyInterestRate=annualInterestRate/12;
        System.out.println("Enter number of years:");
        int numberOfYears=scanner.nextInt();
        double futureInvestmentValue =  Math.pow((1 + monthlyInterestRate) ,(numberOfYears*12));

        System.out.println("Accumulated value is $1043.92 "+futureInvestmentValue);
    }
}
