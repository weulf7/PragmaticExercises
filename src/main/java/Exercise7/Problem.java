package Exercise7;

import java.util.Scanner;

public class Problem {
    public void start(){

        int lenghtInFeet = lenghtOfTheRoom();
        int widhtInFeet = widthOfTheRoom();
        System.out.println("You entered a dimension of " +lenghtInFeet+ " feet by " +widhtInFeet +" feet.");

        int squareFeet = lenghtInFeet * widhtInFeet;
        double squareMeters = squareFeet * 0.092903;

        System.out.println("The area is ");
        System.out.println(squareFeet + " square feet");
        System.out.println(squareMeters + " square meters.");

    }
    public int lenghtOfTheRoom(){
        System.out.println("What is the lenght of the room in feet?:");
        Scanner scanner = new Scanner(System.in);
        int lenghtFeet = scanner.nextInt();
        return lenghtFeet;
    }
    public int widthOfTheRoom(){
        System.out.println("What is the width of the room in feet?:");
        Scanner scanner = new Scanner(System.in);
        int widthFeet = scanner.nextInt();
        return widthFeet;
    }
}
