package chapter07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrence {
    /*7.3 (Count occurrence of numbers) Write a program that reads the integers between 1
    and 100 and counts the occurrences of each. Assume the input ends with 0 .*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int input;
        int counter = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do {
            input = scanner.nextInt();
            numbers[counter] = input;
            counter += 1;
        }
        while (input != 0);
        countOccurrenceOfNumbers(numbers);
    }

    public static void countOccurrenceOfNumbers(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 1; i < 101; i++) {
            int counter = 0;
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] == i) {
                    counter++;
                }
            }
            if (counter != 0) {
                if (counter < 2) System.out.println(i + " occurs " + counter + " time");
                else System.out.println(i + " occurs " + counter + " times");
            }

        }

    }

}
