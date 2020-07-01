package Calculations.Exercise12;

import java.util.Scanner;

public class Problem {
    public void start(){

        int principalAmount = enterAmount();
        double interestRateUser = rateInterest();
        int investmentYears = yearsOfInterest();

        interestRateUser/=100;

        double totalAmount= principalAmount * (interestRateUser *investmentYears) +principalAmount;
        System.out.println("After " + investmentYears + " years at " +interestRateUser + " ,the investment will be worth $" + totalAmount);


    }

    public int enterAmount(){
        System.out.println("Enter the principal amount:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public double rateInterest(){
        System.out.println("Enter the rate of interest:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public int yearsOfInterest(){
        System.out.println("Enter the number of years:");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }
}
