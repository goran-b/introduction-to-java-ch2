import java.util.Scanner;

public class FinanceAppCalculateInterest {
    /* *2.20
     (Financial application: calculate interest) If you know the balance and the annual
     percentage interest rate, you can compute the interest on the next monthly payment
     using the following formula:
     interest = balance * (annualInterestRate/1200)
     Write a program that reads the balance and the annual percentage interest rate and
     displays the interest for the next month.*/

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5\n");
        double balance=scanner.nextDouble();
        double annualInterestRate=scanner.nextDouble();
        double interest = balance * (annualInterestRate/1200);
        System.out.println("The interest is 2.91667 "+interest);
    }
}
