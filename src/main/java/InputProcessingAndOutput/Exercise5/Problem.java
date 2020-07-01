package InputProcessingAndOutput.Exercise5;

import java.util.Scanner;

public class Problem {
    public void start(){
        int firstInput = firstNum();
        int secondInput = secondNumber();
        System.out.println(firstInput + "+" + secondInput+ "=" + (firstInput + secondInput));
        System.out.println(firstInput + "-" + secondInput + "=" + (firstInput - secondInput));
        System.out.println(firstInput + "*" + secondInput + "=" + (firstInput * secondInput));
        System.out.println(firstInput + "/" + secondInput + "=" + (firstInput / secondInput));

    }
    public int firstNum(){
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        return first;
    }
    public int secondNumber(){
        System.out.println("Enter the second number:");
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();
        return second;
    }
}
