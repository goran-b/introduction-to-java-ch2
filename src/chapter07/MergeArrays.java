package chapter07;

import java.util.Arrays;

public class MergeArrays {
    /*7.31 (Merge two sorted lists) Write the following method that merges two sorted lists
    into a new sorted list.
    public static int[] merge(int[] list1, int[] list2)
    Implement the method in a way that takes at most list1.length + list2.
    length comparisons. Write a test program that prompts the user to enter two
    sorted lists and displays the merged list. Here is a sample run. Note that the first
    number in the input indicates the number of the elements in the list. This number
    is not part of the list.*/
    public static void main(String[] args) {
        int[] list1 = {1, 5, 16, 61, 111};
        int[] list2 = {2, 4, 5, 6};
        System.out.print("The merged list is ");
        for (int i : merge(list1, list2)) {
            System.out.print(i+" ");
        };

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            mergedList[i] = list1[i];
        }

        for (int i = list1.length, j = 0; i < mergedList.length; i++, j++) {
            mergedList[i] = list2[j];
        }
        Arrays.sort(mergedList);
        return mergedList;
    }
}
