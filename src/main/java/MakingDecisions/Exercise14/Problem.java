package MakingDecisions.Exercise14;

import java.util.Scanner;

public class Problem {
    public void start() {
        int theAmount = orderAmount();
        String theName = stateName();
        double subtotal = theAmount;
        double tax = (5.5 * theAmount) / 100;
        double total = subtotal + tax;


        if (theName.equals("WI")) {
            System.out.println("The subtotal is $" + subtotal);
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + total);
        }



        if (theName.equals("MN"))
              System.out.println("The total is:"+theAmount);


    }

    public int orderAmount(){
        System.out.println("What is the order amount?:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public String stateName(){
        System.out.println("What is the state?:");
        Scanner scanner= new Scanner(System.in);
        return scanner.next();
    }
}
