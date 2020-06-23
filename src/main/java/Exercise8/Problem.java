package Exercise8;

import java.util.Scanner;

public class Problem {
    public void start(){
        int numberOfPeople = countOfPeople();
        int numberOfPizzas = howManyPizza();

        int slicePerPizza = (8 * numberOfPizzas)/numberOfPeople;
        int leftOvers = (8* numberOfPizzas) -numberOfPeople ;

        System.out.println(numberOfPeople +" people with " +numberOfPizzas + " pizzas");
        System.out.println("Each person gets " +slicePerPizza +" slices of pizza");
        System.out.println("There are " +leftOvers + " leftover pieces.");


    }
    public int countOfPeople(){
        System.out.println("How many people?:");
        Scanner scanner = new Scanner(System.in);
        int playerCount = scanner.nextInt();
        return playerCount;
    }
    public int howManyPizza(){
        System.out.println("How many pizzas do you have?:");
        Scanner scanner = new Scanner(System.in);
        int numberOfPizza = scanner.nextInt();
        return numberOfPizza;
    }

}
