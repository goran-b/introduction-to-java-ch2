package chapther5;

public class HeadOrTail {
    /* 4.40 (Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.*/
    public static void main(String[] args) {

        double randomNumber = 0;
        int tailCounter = 0;
        int headCounter = 0;

        for (int i = 0; i <= 1000000; i++) {
            randomNumber = Math.random();
            if (randomNumber > 0.5) tailCounter++;
            else headCounter++;
        }
        System.out.println("Head: " + headCounter + " Tail: " + tailCounter);
    }
}
