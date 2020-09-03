package DataStructures;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise36 {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter some numbers and when you're done type 'done'.");
computingStatics();
    }
    private static void computingStatics(){
        int total=0;
        int average=0;
        int minimum=0;
        int maximum=0;
        double standardDeviation=0;

        ArrayList<Integer>numbers=new ArrayList<>();
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Enter a number:");
                int number = scanner.nextInt();

                total=total+number;
                numbers.add(number);
                average=total/numbers.size();

                minimum=getMinValue(numbers);
                maximum=getMaxValue(numbers);
                standardDeviation=standardDeviation(numbers);

            }
        }catch (InputMismatchException r){
            System.out.println(numbers);
        }

        System.out.println("The average is:"+average);
        System.out.println("The minimum is:"+minimum);
        System.out.println("The maximum is:"+maximum);
        System.out.println("The standard deviation = "+standardDeviation);



    }

    private static int getMinValue(ArrayList<Integer> numbers){

        int minValue=numbers.get(0);

        for (int i=0;i<numbers.size();i++){
            if (numbers.get(i)<minValue){
                minValue=numbers.get(i);
            }
        }
        return minValue;
    }

    private static int getMaxValue(ArrayList<Integer> numbers){
        int maxValue=numbers.get(0);
        for (int i =0;i<numbers.size();i++){
            if (numbers.get(i)>maxValue){
                maxValue=numbers.get(i);
            }
        }
        return maxValue;
    }

    private static double standardDeviation(ArrayList<Integer>numbers){
        double sum=0.0;
        double sd=0.0;
        int length=numbers.size();

        for (double num:numbers){
            sum+=num;
        }
        double mean=sum/length;
        for (double num:numbers){
            sd+=Math.pow(num-mean,2);

        }
        return Math.sqrt(sd/(length));
    }




}
