package MakingDecisions.Exercise22;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        comparingNumbers();



    }
    public static void comparingNumbers(){
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int first=scanner.nextInt();

        System.out.println("Enter the second number:");
        int second=scanner.nextInt();

        System.out.println("Enter the third number:");
        int third=scanner.nextInt();

       if (first>second && first>third){
           System.out.println(first+" is the largest number.");
       }
       else if (second>first && second>third){
           System.out.println(second+" is the largest number.");
       }
       else{
           System.out.println(third +" is the largest number.");
       }


    }
}
