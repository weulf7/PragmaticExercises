package Calculations.Exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        pizzaCalculator();

    }
    public static void pizzaCalculator(){
        System.out.println("How many people?");
        Scanner scanner  = new Scanner(System.in);
        int people = scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = scanner.nextInt();

        System.out.println(people+" people with "+pizzas+" pizzas.");


        int pizzaSlices=pizzas*8;
        int pizzaPerPeople=pizzaSlices/people;
        int leftOver=pizzaPerPeople%people;

        System.out.println("Each person gets "+pizzaPerPeople+" slices of pizza."+'\n'
                +"There are "+leftOver+" leftover pieces.");

    }



}
