package Calculations.Exercise8;

import java.util.Scanner;

public class Problem {
    public void start() {
        pizzaCalculator();


    }

    public void pizzaCalculator(){
        System.out.println("Enter the number of people:");
        Scanner scanner = new Scanner(System.in);
        int numberPeople = scanner.nextInt();


        System.out.println("Enter the number of pizza:");
        int numberPizza=scanner.nextInt();

        System.out.println("You have "+numberPizza+" for "+numberPeople+" people");

        int pizzaSlices=numberPizza*8;
        int pizzaPerPeople=pizzaSlices/numberPeople;
        int leftOvers=pizzaSlices %numberPeople;

        System.out.println("Each person gets "+pizzaPerPeople+" slices of pizza."+'\n'
                +"There are "+leftOvers+" leftover pieces");

    }
}
