package Calculations.Exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        exchange();



    }

    public static void exchange(){
        System.out.println("How many euros you want to exchange?");
        Scanner scanner  = new Scanner(System.in);
        int euros = scanner.nextInt();

        System.out.println("What is the exchange rate?");
        double rate = scanner.nextDouble();

        double euroToDollar=euros*rate;

        System.out.println(euros + " euros at an exchange rate of "+ rate + " is " +euroToDollar + " U.S. dollars.");
    }
}
