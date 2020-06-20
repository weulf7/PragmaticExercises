package Exercise2;

import java.util.Scanner;

public class Problem {
    public void start(){
        String wordLenght = lenghtOfWord();
        System.out.println("The word " +wordLenght + " has " +wordLenght.length() + " characters.");

    }
    public String lenghtOfWord(){
        System.out.println("What is the input string?:");
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        return inputWord;
    }
}
