package MakingDecisions.Exercise18ResolvingWithIfStatement;

import java.util.Scanner;

public class Problem {


    double fahrenheit;
    double celsius;

    public void start(){
        choiceMenu();


    }


    public double fahrToCel() {
        double calculation = (fahrenheit - 32) * 5 / 9;
        return calculation;
    }

    public double celToFahr() {
        double calculation2 = (celsius * 9 / 5) + 32;
        return calculation2;
    }

    public void choiceMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        System.out.println("Press E to exit the application.");
        option = scanner.next().toUpperCase().charAt(0);
        System.out.println("Your choice is: " + option);


        if (option=='C'){
            System.out.println("Please enter the temperature in Fahrenheit:");
            double fahrOption = scanner.nextDouble();
            fahrenheit=fahrOption;
            System.out.println("The temperature in Celsius is " +fahrToCel() );
            System.out.println("Thank you for using services.");


        }
        else if (option=='F' ||option=='f'){
            System.out.println("Please enter the temperature in celsius:");
            double celsOption = scanner.nextDouble();
            celsius=celsOption;
            System.out.println("The temperature in Fahrenheit is " + celToFahr());
            System.out.println("Thank you for using services.");
        }
        else {
            System.out.println("Invalid option.Try again.");
        }
}
}