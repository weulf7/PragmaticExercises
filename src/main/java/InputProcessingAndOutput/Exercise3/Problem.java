package InputProcessingAndOutput.Exercise3;

import java.util.Scanner;

public class Problem {
    public void start(){
        String theQuote = whatIsTheQuote();
        String whoSaidThat = whoSaidIt();
        System.out.println(whoSaidThat +" says:'"+ theQuote + ".'" );

    }
    public String whatIsTheQuote(){
        System.out.println("What is the quote?:");
        Scanner scanner = new Scanner(System.in);
        String inputQuote = scanner.nextLine();
        return inputQuote;
    }
    public  String whoSaidIt(){
        System.out.println("Who said it?:");
        Scanner scanner = new Scanner(System.in);
        String inputWhoSaid = scanner.nextLine();
        return  inputWhoSaid;
    }
}
