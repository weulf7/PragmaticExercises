package org.example;

import java.util.Scanner;

public class Problem1 {
    public void start(){
        String getName = userName();
        System.out.println("Hello, " +getName + " , it's nice to meet you!");

    }
    public String userName(){
        System.out.println("What is your name?:");
        Scanner scanner = new Scanner(System.in);
        String enterName = scanner.nextLine();
        return enterName;
    }
}
