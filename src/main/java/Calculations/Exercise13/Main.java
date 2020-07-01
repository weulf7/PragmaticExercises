package Calculations.Exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Problem problem= new Problem();
        problem.start();
//
//        compoundInterest();

    }

//    public static void compoundInterest(){
//
//        System.out.println("Enter the principal amount:");
//        Scanner scanner = new Scanner(System.in);
//        int principal = scanner.nextInt();
//
//        System.out.println("Enter the rate of interest:");
//        double rate = scanner.nextDouble();
//
//        System.out.println("Enter the number of years:");
//        int years = scanner.nextInt();
//
//        System.out.println("Enter the number of times the interest is compounded:");
//        int compound = scanner.nextInt();
//
//        double newRate=rate/100;
//
//        double calculator=principal*Math.pow((0.01+newRate/compound),compound*years);
//        double subTotal=principal+calculator;
//        double total=(subTotal-principal)+principal;
//
//        System.out.println("$"+principal+" invested at %"+rate+" for "+years+'\n'
//                +"compounded "+compound+" times per year, is $"+total+".");
//    }
}
