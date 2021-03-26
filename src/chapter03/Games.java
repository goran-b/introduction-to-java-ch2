package chapter03;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        //headsOrTail();
        scissorRockPapper();
    }

    public static void headsOrTail() {
        /*3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip of
        a coin results in heads or tails. The program randomly generates an integer 0 or 1 ,
        which represents head or tail. The program prompts the user to enter a guess and
        reports whether the guess is correct or incorrect.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess head or tail (0 for head and 1 for tail): ");

        int input = scanner.nextInt();

        if (input > 2 && input < 0) return;

        double randomNumber = Math.random();

        int randomCoinFlip = 0;
        if (randomNumber > 0.5) randomCoinFlip = 1;

        if (randomCoinFlip == input) System.out.println("You are guess right!");
        else System.out.println("You are guess right!");

    }

    public static void scissorRockPapper() {
        /* 3.17(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
        paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
        wrap a rock.) The program randomly generates a number 0 , 1 , or 2 representing
        scissor, rock, and paper. The program prompts the user to enter a number 0 , 1 , or
        2 and displays a message indicating whether the user or the computer wins, loses,
        or draws.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");

        int input = scanner.nextInt();

        if (input > 1 && input < 0) return;

        double randomNumber = (int) (Math.random() * 3);
        System.out.println(randomNumber);

        if (input == 0) {
            if (randomNumber == 0) System.out.println("The computer is scissor. You are scissor. It is a draw");
            else if (randomNumber == 1) System.out.println("The computer is rock. You are scissor. You lose");
            else System.out.println("The computer is paper. You are scissor. You won");
        } else if (input == 1) {
            if (randomNumber == 0) System.out.println("The computer is scissor. You are rock.You won ");
            else if (randomNumber == 1) System.out.println("The computer is rock. You are rock.It is a draw ");
            else System.out.println("The computer is paper. You are rock. You lose");
        } else {
            if (randomNumber == 0) System.out.println("The computer is scissor. You are paper. You lose");
            else if (randomNumber == 1) System.out.println("The computer is rock. You are paper. You won");
            else System.out.println("The computer is paper. You are paper.It is a draw");
        }


    }
}
