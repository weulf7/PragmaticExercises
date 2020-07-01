package InputProcessingAndOutput.Exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        someCrazyPhrase();

    }

    public static void someCrazyPhrase(){
        System.out.println("Enter a noun:");
        Scanner scanner =new Scanner(System.in);
        String noun = scanner.nextLine();


        System.out.println("Enter a verb:");
        String verb=scanner.nextLine();


        System.out.println("Enter an adjective:");
        String adjective=scanner.nextLine();

        System.out.println("Enter an adverb:");
        String adverb=scanner.nextLine();

        System.out.println("Do you "+verb +" your "+adjective+" " +noun + " " +adverb+ "?.That's hilarious!");
    }
}
