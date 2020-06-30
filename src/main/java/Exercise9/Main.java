package Exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        paintCalculator();

    }

    public static void paintCalculator(){

        final double gallonsPerSurface=350.0;

        System.out.println("Enter the length of the room in feet:");
        Scanner scanner= new Scanner(System.in);
        int lengthFeet=scanner.nextInt();

        System.out.println("Enter the width of the room in feet:");
        int widthFeet=scanner.nextInt();

        int surface=lengthFeet*widthFeet;
        double gallonsNeeded=Math.ceil(surface/gallonsPerSurface);

        System.out.println("YOu will need "+gallonsNeeded+" to cover "+surface+" square feet surface.");
    }

}
