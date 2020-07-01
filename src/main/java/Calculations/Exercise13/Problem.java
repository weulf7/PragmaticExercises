package Calculations.Exercise13;

import java.util.Scanner;

public class Problem {
    public void start(){

        int principal = principalAmount();
        double rate = annualRate();
        int perYear = amountYear();
        int compoundYear = compoundPerYear();

        double newRate= rate /100;

        double total= principal* Math.pow((1+newRate / compoundYear),compoundYear *perYear);
        double finalTotal=(total-principal)+principal;

        System.out.println(principal + " invested at " + rate +" for " +perYear+" years compounded "+ compoundYear +" times per year is $" +finalTotal+".");

    }

    public int principalAmount(){
        System.out.println("What is the principal amount?:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public double annualRate(){
        System.out.println("What is the rate?:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public int amountYear(){
        System.out.println("What is the number of years?:");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }
    public int compoundPerYear(){
        System.out.println("What is the number of times the interest is compounded per year?:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
