package chapther3;

import java.util.Scanner;

public class RandomMonth {
    /*3.4 (Random month) Write a program that randomly generates an integer between 1
    and 12 and displays the English month name January, February, ..., December for
    the number 1, 2, ..., 12, accordingly.*/

    public static void main(String[] args) {
        int randomNumberOfMonth=(int)(Math.random()*12+1);

        switch (randomNumberOfMonth){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Avg");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Some error");

        }
    }
}
