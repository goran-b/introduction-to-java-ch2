package chapter07;

import java.util.Scanner;

public class EliminateDuplicate {
    /* 7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the
    duplicate values in the array using the following method header:
    public static int[] eliminateDuplicates(int[] list)
    Write a test program that reads in ten integers, invokes the method, and displays*/

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        eliminateDuplicates(nums);

        System.out.println("Unesite broj elemenata niza:");
        Scanner scanner = new Scanner(System.in);
        int lenght =scanner.nextInt();
        int list[] = new int[lenght];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Unese eleement niza: ");
            list[i] = scanner.nextInt();
        }

        eliminateDuplicates(list);
    }

    public static int[] eliminateDuplicates(int[] list) {
        int []temp=new int[list.length];
        int counter=0;

        for (int i = 0; i < list.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                System.out.print(list[i] + " ");
                temp[counter]=list[i];
                counter++;
            }
        }

        int []newList=new int[counter];
        for (int i=0;i<counter;i++){
            newList[i]=temp[i];
        }
        return newList;
    }
}
