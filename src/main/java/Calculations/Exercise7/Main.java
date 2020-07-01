package Calculations.Exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){



        areaOfRectangularRoom();



    }

    public static void areaOfRectangularRoom(){
        final double transMeter=0.09290304;
        System.out.println("Enter the length of the room in feet:");
        Scanner scanner = new Scanner(System.in);
        int lengthInFeet = scanner.nextInt();


        System.out.println("Enter the width of the room in feet:");
        int widthInFeet = scanner.nextInt();

        System.out.println("You entered a dimension of "+lengthInFeet+" feet by "+widthInFeet+" feet.");

        int surface= lengthInFeet*widthInFeet;
        double squareMeter=surface*transMeter;

        System.out.println("The area is "+"\n"
                +surface+" square feet"+'\n'
                +squareMeter+" square meters.");


    }
}
