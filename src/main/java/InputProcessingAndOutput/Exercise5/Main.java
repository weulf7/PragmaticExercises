package InputProcessingAndOutput.Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        calculations();

    }

    public static void calculations(){
        System.out.println("Enter the first number:");
        Scanner scanner =new Scanner(System.in);
        int first = scanner.nextInt();

        System.out.println("Enter the second number:");
        int second = scanner.nextInt();

        System.out.println(first + "+" + second+ "=" + (first + second));
        System.out.println(first + "-" + second + "=" + (first - second));
        System.out.println(first + "*" + second + "=" + (first * second));
        System.out.println(first + "/" + second + "=" + (first / second));
    }
}
