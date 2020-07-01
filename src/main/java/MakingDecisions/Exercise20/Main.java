package MakingDecisions.Exercise20;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        taxCalculator();


    }

    public static void taxCalculator(){

        System.out.println("What is the order amount:");
        Scanner scanner = new Scanner(System.in);
        double orderAmount=scanner.nextInt();

        System.out.println("What state do you live in?");
        String stateChoice = scanner.next();

        if (stateChoice.equals("Wisconsin")){
           System.out.println("What is the county you live in Wisconsin?");
            String countyChoice = scanner.next();
            if (countyChoice.equals("Eau Claire")){
               double tax=(orderAmount*0.005);
               double total=orderAmount+tax;
               System.out.println("The tax is "+tax+'\n'
                       +"The total is "+total+".");
           }else if (countyChoice.equals("Dunn")){
               double tax2=(orderAmount*0.004);
               double total2=orderAmount+tax2;
               System.out.println("The tax is "+tax2+'\n'
                       +"The total is "+total2+".");
           }else {
               System.out.println("the total is "+orderAmount);
           }
       }
    if (stateChoice.equals("Illinois")){
        double tax3=(orderAmount*8)/100;
        double total3=orderAmount+tax3;
        System.out.println("The tax is "+tax3+'\n'
                +"The total is "+total3+".");
    }
    else {
        System.out.println("Thank you for using services!");
    }


    }
}
