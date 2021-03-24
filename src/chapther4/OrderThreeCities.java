package chapther4;

import java.util.Scanner;

public class OrderThreeCities {
    /* 4.24 (Order three cities) Write a program that prompts the user to enter three cities and
    displays them in ascending order.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first city: ");
        String firstCity = scanner.nextLine();
        System.out.println("Enter second city: ");
        String secondCity = scanner.nextLine();
        System.out.println("Enter third city: ");
        String thirdCity = scanner.nextLine();
        String temp;

        if(firstCity.charAt(0)>secondCity.charAt(0)){
            temp=firstCity;
            firstCity=secondCity;
            secondCity=temp;
        }
        if(secondCity.charAt(0)>thirdCity.charAt(0)){
            temp=secondCity;
            secondCity=thirdCity;
            thirdCity=temp;
        }
        if(firstCity.charAt(0)>secondCity.charAt(0)){
            temp=firstCity;
            firstCity=secondCity;
            secondCity=temp;
        }




        System.out.println("The three cities in alphabetical order are "+firstCity+" "+secondCity+" "+thirdCity);
    }
}
