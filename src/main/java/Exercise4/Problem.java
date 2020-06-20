package Exercise4;

import java.util.Scanner;

public class Problem {
    public void start(){
        String enteredNoun = noun();
        String enterdVerb = verb();
        String enterdAdjective = adjective();
        String enteredAdverb = adverb();
        System.out.println("Do you "+enterdVerb +" your "+enterdAdjective+" " +enteredNoun + " " +enteredAdverb+ "?.That's hilarious!");

    }
    public String noun(){
        System.out.println("Enter a noun:");
        Scanner scanner= new Scanner(System.in);
        String enterNoun = scanner.nextLine();
        return enterNoun;
    }
    public String verb(){
        System.out.println("Enter a verb:");
        Scanner scanner = new Scanner(System.in);
        String enterVerb = scanner.nextLine();
        return enterVerb;
    }
    public String adjective(){
        System.out.println("Enter an adjective:");
        Scanner scanner = new Scanner(System.in);
        String enterAdjective = scanner.nextLine();
        return enterAdjective;
    }
    public String adverb(){
        System.out.println("Enter and adverb:");
        Scanner scanner = new Scanner(System.in);
        String enterAdverb = scanner.nextLine();
        return enterAdverb;
    }
}
