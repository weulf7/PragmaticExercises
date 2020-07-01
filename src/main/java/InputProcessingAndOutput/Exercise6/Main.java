package InputProcessingAndOutput.Exercise6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        retirementCalculator();

    }
    public static void retirementCalculator(){

        System.out.println("Enter your current age:");
        Scanner scanner = new Scanner(System.in);
        int currentAge = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        int ageOfRetirement = scanner.nextInt();

        int yearsLeft=ageOfRetirement-currentAge;

        System.out.println("You have "+yearsLeft+" years left, until you can retire.");

        int currentYear = LocalDate.now().getYear();
        int yearOfRetirement=(currentYear)+yearsLeft;

        System.out.println("It's "+currentYear+", so you can retire in "+yearOfRetirement+".");

    }
}
