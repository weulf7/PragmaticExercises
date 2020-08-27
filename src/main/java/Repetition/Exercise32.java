package Repetition;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise32 {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

    }

    private static int guessNumber() {
        int numberToGuess;
        int guess;
        System.out.println("Let's play Guess the Number.");
        try {
            System.out.println("Pick the difficulty level(1,2 or 3):");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    numberToGuess = ThreadLocalRandom.current().nextInt(10);
                    System.out.println("You've picked difficulty level 1");
                    System.out.println("I have the number.What's your guess?");
                    guess = scanner.nextInt();
                    while (guess != numberToGuess) {
                        if (guess > numberToGuess) {
                            System.out.println("To high.Guess again:");
                        } else if (guess < numberToGuess) {
                            System.out.println("To low.Guess again:");
                        }
//
                        guess = scanner.nextInt();
                    }
                    if (guess == numberToGuess) {
                        System.out.println("You got it!The number was " + numberToGuess);
                        System.out.println("Play again?(y/n)");
                        char play = scanner.next().charAt(0);
                        if (play=='n'){
                            break;
                        }else if (play=='y'){
                            return guessNumber();
                        }else {
                            System.out.println("Invalid!!!");
                        }

                    }
                case 2:
                    numberToGuess = ThreadLocalRandom.current().nextInt(100);
                    System.out.println("You've picked difficulty level 2");
                    System.out.println("I have the number.What's your guess?");
                    guess = scanner.nextInt();
                    while (guess != numberToGuess) {
                        if (guess > numberToGuess) {
                            System.out.println("To high.Guess again:");
                        } else if (guess < numberToGuess) {
                            System.out.println("To low.Guess again:");
                        }
                        guess = scanner.nextInt();
                    }
                    if (guess == numberToGuess) {
                        System.out.println("You got it!The number was " + numberToGuess);
                        break;
                    }
                case 3:
                    numberToGuess = ThreadLocalRandom.current().nextInt(1000);
                    System.out.println("You've picked difficulty level 3");
                    System.out.println("I have the number.What's your guess?");
                    guess = scanner.nextInt();
                    while (guess != numberToGuess) {
                        if (guess > numberToGuess) {
                            System.out.println("To high.Guess again:");
                        } else if (guess < numberToGuess) {
                            System.out.println("To low.Guess again:");
                        }
                        guess = scanner.nextInt();
                    }
                    if (guess == numberToGuess) {
                        System.out.println("You got it!The number was " + numberToGuess);
                        break;


                    }


            }

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("You can introduce only numeric values!");


        }
        return 0;
    }
}
