package Repetition;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise31 {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        heartRateCalculator();

    }
    private static int heartRateCalculator(){
        int targetRate;
        int age=0;
        int pulse=0;
        try {
            System.out.println("Enter your age:");
            age = scanner.nextInt();
            if (age == 0) {
                System.out.println("Invalid value!");
                return heartRateCalculator();
            }


            System.out.println("Enter your pulse:");
            pulse = scanner.nextInt();
            if (pulse == 0) {
                System.out.println("Invalid value!");
                return heartRateCalculator();
            }

        }catch (InputMismatchException e){
            System.out.println("Please enter numeric values!");
            return 0;
        }


        System.out.println();
        System.out.println();
        System.out.println("Rating pulse:"+pulse+"     Age:"+age );
        System.out.println();
        System.out.println("Intensity   Rate");
        System.out.println("----------|------");
        for (int i =55;i<=95;i+=5){
//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

            targetRate=(((220-age)-pulse)*i)/100+pulse;
            System.out.println(i+"%"+"       |"+" "+targetRate+" bpm");



        }
        return 1;
    }


}
