package chapther2;

import java.util.Scanner;

public class CostOfDriving {
    /*
    (Cost of driving) Write a program that prompts the user to enter the distance to
    drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
    and displays the cost of the trip. Here is a sample run:
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the driving distance: 900.5 ");
        double distance=scanner.nextDouble();
        System.out.println("Enter miles per gallon: 25.5 ");
        double milesPerGallon=scanner.nextDouble();
        System.out.println("Enter price per gallon: 3.55 ");
        double pricePerGallon=scanner.nextDouble();
        double costOfDriving=distance/milesPerGallon*pricePerGallon;
        System.out.println("The cost of driving is $125.36 "+costOfDriving);
    }
}
