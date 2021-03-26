package chapter05;

public class Combinations {
    /* 5.43 (Math: combinations) Write a program that displays all possible combinations
    for picking two numbers from integers 1 to 7. Also display the total number of
    all combinations.*/
    public static void main(String[] args) {

        int numberOfCombinations = 0;

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                System.out.println(i + " " +j);
                numberOfCombinations++;
            }
        }
        System.out.println();
        System.out.println("The total number of all combinations is " + numberOfCombinations);
    }
}

