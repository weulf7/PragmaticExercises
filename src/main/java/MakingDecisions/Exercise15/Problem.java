package MakingDecisions.Exercise15;

import java.util.Scanner;

public class Problem {
    String pwd="abc$123";

    public void start(){
        passwordInput();


    }

    public void  passwordInput(){
        System.out.println("What is the password?:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equals(pwd)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");

        }

    }


}
