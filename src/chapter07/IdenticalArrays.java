package chapter07;

import java.util.Arrays;

public class IdenticalArrays {
    /*
    7.27 (Identical arrays) The arrays list1 and list2 are identical if they have the
    same contents. Write a method that returns true if list1 and list2 are identical,
    using the following header:
    public static boolean equals(int[] list1, int[] list2)
    Write a test program that prompts the user to enter two lists of integers and displays
    whether the two are identical. Here are the sample runs. Note that the first
    number in the input indicates the number of the elements in the list. This number
    is not part of the list.
    * */
    public static void main(String[] args) {
        int[] list1 = {2, 5, 6, 6, 1};
        int[] list2 = {2, 5, 6, 1, 6};
        checkIsIdentical(list1, list2);
        int[] list3 = {5, 5, 6, 6, 1};
        int[] list4 = {2, 5, 6, 1, 6};
        checkIsIdentical(list3, list4);

    }

    public static void checkIsIdentical(int[] list1, int[] list2) {
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }

    private static boolean equals(int[] list1, int[] list2) {
        Arrays.sort(list1);
        Arrays.sort(list2);
        return Arrays.equals(list1, list2);
    }
}
