package InputProcessingAndOutput.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        lengthOfWord();


    }
    public static void lengthOfWord(){
        System.out.println("Enter a word please:");
        Scanner scanner = new Scanner(System.in);
        String actualWord = scanner.nextLine();

        System.out.println("The word "+actualWord+", has "+actualWord.length()+" characters.");
    }
}
