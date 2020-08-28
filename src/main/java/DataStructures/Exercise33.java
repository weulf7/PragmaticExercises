package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise33 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        magicBallGame();
    }

    private static void magicBallGame() {
        List<String> answers = new ArrayList<>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("Ask again later");

        Random random = new Random();

        System.out.println("What is your question?");
        scanner.nextLine();

        String randomAnswer = answers.get(random.nextInt(answers.size()));

        System.out.println(randomAnswer);


    }


}
