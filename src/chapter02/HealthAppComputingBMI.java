package chapter02;

import java.util.Scanner;

public class HealthAppComputingBMI {
    /*
    * *2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
    health on weight. It can be calculated by taking your weight in kilograms and
    dividing by the square of your height in meters. Write a program that prompts the
    user to enter a weight in pounds and height in inches and displays the BMI. Note
t   hat one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
    * */
    public static void main(String[] args) {
        final double INCHS_TO_METERS = 0.0254;
        final double POUNDS_TO_KG = 0.45359237;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds: 95.5\n");
        double weightInPounds = scanner.nextDouble();
        System.out.println("Enter height in inches: 50\n");
        double heightInInches = scanner.nextDouble();
        double weghtsInKg = weightInPounds * POUNDS_TO_KG;
        double heightInMeters = heightInInches * INCHS_TO_METERS;
        double BMI = weghtsInKg / (heightInMeters * heightInMeters);
        System.out.println("BMI is 26.8573 " + BMI);


    }


}
