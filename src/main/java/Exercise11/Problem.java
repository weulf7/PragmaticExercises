package Exercise11;

import java.util.Scanner;

public class Problem {
    public void  start() {

        int userEuroInput = euroInput();
        double userExchangeRateInput = exchangeRateEuros();
        double exchangedAmount = userEuroInput * userExchangeRateInput;

        System.out.println(userEuroInput + " euros at an exchange rate of "+ userExchangeRateInput + " is " +exchangedAmount + " U.S. dollars.");


    }

    public int euroInput(){
        System.out.println("How many euros are you exchanging?:");
        Scanner scanner = new Scanner(System.in);
        int exchangingEuros = scanner.nextInt();
        return exchangingEuros;
    }

    public double exchangeRateEuros(){
        System.out.println("What is the exchange rate ?:");
        Scanner scanner = new Scanner(System.in);
        double exchangeRateOfEuros = scanner.nextDouble();
        return exchangeRateOfEuros;
    }
}