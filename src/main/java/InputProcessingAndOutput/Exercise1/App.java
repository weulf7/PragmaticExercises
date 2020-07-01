package InputProcessingAndOutput.Exercise1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        userName();

    }

    public static void userName(){
        System.out.println("Enter your name please:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+name+", it is nice to meet you!");

    }
}
