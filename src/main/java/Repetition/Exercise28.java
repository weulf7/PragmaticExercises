package Repetition;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
calculator();
    }
    private static void calculator(){
        Scanner sc=new Scanner(System.in);
        int a=0;

        for (int i=0;i<5;i++){
            System.out.println("Enter a number");
            a=a+sc.nextInt();



        }
        System.out.println("The total is "+a);


    }




}
