package InputProcessingAndOutput.Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
    quote();
    }

    public static void quote(){
        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        String quoteInput = scanner.nextLine();

        System.out.println("Who said it?");
        String whoSaid=scanner.nextLine();

        System.out.println(whoSaid+" says:'"+quoteInput+".'");
    }
}
