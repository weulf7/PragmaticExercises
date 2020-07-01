package Calculations.Exercise12;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        simpleInterest();


    }

    public static void simpleInterest(){
        System.out.println("Enter the principal:");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter the number of years:");
        int years = scanner.nextInt();

        double amountAtEnd=principal*((rate/100)*years);
        double total=amountAtEnd+principal;

        System.out.println("After " + years+ " years at " +rate +"%, the investment will be worth $" + total+".");

    }



}
