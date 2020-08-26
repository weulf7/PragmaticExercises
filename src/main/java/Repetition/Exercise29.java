package Repetition;


import java.util.Scanner;


public class Exercise29 {
    public static void main(String[] args) {
handleBadInputs();

    }

    private static int handleBadInputs(){
        int total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rate of return:");
        String input = scanner.nextLine();


        try{
            total=72/Integer.parseInt(input);
            System.out.println("It will take "+total+" years to double your investment!");
        }catch (NumberFormatException n){
            System.out.println("Please introduce numeric value!");
            return handleBadInputs();
        }catch (ArithmeticException a){
            System.out.println("You can't enter 0!");
            return handleBadInputs();
        }
return 1;
    }
}


