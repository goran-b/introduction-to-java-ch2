package chapther3;

import java.util.Scanner;

public class FinancialCompareCost {
    /*3.33
    (Financial: compare costs) Suppose you shop for rice in two different packages.
    You would like to write a program to compare the cost. The program prompts the
    user to enter the weight and price of the each package and displays the one with
    the better price.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: 50 24.59\n");
        double firstPackageWeight= scanner.nextDouble();
        double firstPackagePrice= scanner.nextDouble();
        double firstPackageScale=firstPackagePrice/firstPackageWeight;

        System.out.println("Enter weight and price for package 2: 25 11.99\n");
        double secondPackageWeight= scanner.nextDouble();
        double secondPackagePrice= scanner.nextDouble();
        double secondPackageScale=secondPackagePrice/secondPackageWeight;

        if(firstPackageScale<secondPackageScale) System.out.println("Package 1 has a better price.");
        else System.out.println("Package 2 has a better price.");

    }
}
