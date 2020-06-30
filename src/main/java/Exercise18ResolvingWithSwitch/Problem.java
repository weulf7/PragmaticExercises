package Exercise18ResolvingWithSwitch;

import java.util.Scanner;

public class Problem {

    double celsius;
    double fahrenheit;


    public void start() {
        choiceMenu();


    }

    //Operation methods

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

        do {

            switch (option) {

                case 'C':
                    System.out.println("Please enter the temperature in Fahrenheit:");
                    double fahrOption = scanner.nextDouble();
                    fahrenheit=fahrOption;
                    System.out.println("The temperature in Celsius is " +fahrToCel() );
                    break;
                case 'F':
                    System.out.println("Please enter the temperature in celsius:");
                    double celsOption = scanner.nextDouble();
                      celsius=celsOption;
                    System.out.println("The temperature in Fahrenheit is " + celToFahr());
                    break;

                case 'E':
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Invalid option!!Try again.");
                    break;
            }


        }
        while (option == 'E');
        System.out.println("Thank you for using services." );

    }
}
