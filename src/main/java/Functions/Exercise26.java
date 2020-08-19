package Functions;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
calc();
    }


    private static void calc(){
        double apr;
        double n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your balance:");
        double b = scanner.nextDouble();

        System.out.println("What is the APR on the card (as percent)?:");
        double s = scanner.nextDouble();
        apr=s/100;

        System.out.println("What is the monthly payment you can make?:");
        double p = scanner.nextDouble();

        double i=apr/365;

        n=-(1.0/30)*(Math.log(1+(b/p)*(1-(Math.pow((1+i),30))))/Math.log(1+i));

        System.out.println("It will take "+Math.round(Math.ceil(n))+" months to pay!");





    }


}
