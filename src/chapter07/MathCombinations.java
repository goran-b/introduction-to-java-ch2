package chapter07;

public class MathCombinations {
    /*7.28 (Math: combinations) Write a program that prompts the user to enter 10 integers
    and displays all combinations of picking two numbers from the 10.*/
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 12, 11, 6, 13, 4, 5, 22};
        combinations(nums);

    }

    public static void combinations(int[] list) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) continue;
                System.out.println(list[i] + " " + list[j]);
                counter++;
            }
        }
        System.out.println("First counter " + counter);
    }

}
