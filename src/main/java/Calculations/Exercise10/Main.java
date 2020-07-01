package Calculations.Exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        selfCheckout();


    }

    public static void selfCheckout(){

            System.out.println("Enter the price of item 1: ");
            Scanner scanner = new Scanner(System.in);
            int price1 = scanner.nextInt();

            System.out.println("Enter the quantity of item 1: ");
            int quantity1 = scanner.nextInt();

            System.out.println("Enter the price of item 2: ");
            int price2= scanner.nextInt();

            System.out.println("Enter the quantity of item 2: ");
            int quantity2 = scanner.nextInt();

            System.out.println("Enter the price of item 3 : ");
            int price3 = scanner.nextInt();


            System.out.println("Enter the quantity of item 3: ");
            int quantity3 = scanner.nextInt();


        double subtotal = (price1* quantity1)+(price2*quantity2)+(price3*quantity3);
        System.out.println("Subtotal: $"+subtotal);
        double tax = (subtotal * 5.5) / 100;
        System.out.println("Tax : $" +tax);
        double total=subtotal +tax;
        System.out.println("Total : $" +total);
        }

    }

