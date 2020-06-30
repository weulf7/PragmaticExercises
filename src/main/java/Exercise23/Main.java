package Exercise23;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        carTroubleshooting();

    }


    public static void carTroubleshooting(){


        System.out.println("Is the car silent when u turn down the key?");
        Scanner scanner = new Scanner(System.in);
        char option = scanner.next().charAt(0);

        if (option=='y'){
            System.out.println("Are the battery terminals corroded? ");
            option=scanner.next().charAt(0);
        if (option=='y'){
            System.out.println("Clean terminals and try starting again!");
        }else if (option=='n'){
            System.out.println("Replace cables and try again.");
        }
        }else if (option=='n'){
            System.out.println("Does the car making clicking noice?");
            option=scanner.next().charAt(0);

            if (option=='y'){
                System.out.println("Replace the battery.");
            }
            else if (option=='n'){
                System.out.println("Does the car crank up but fail to start?");
                option=scanner.next().charAt(0);

                if (option=='y'){
                    System.out.println("Check spark plug connections.");
                } else if (option == 'n') {
                    System.out.println("Does the engine start and then die?");
                    option=scanner.next().charAt(0);

                    if (option=='y'){
                        System.out.println("Does your car have fuel injection?");
                        option=scanner.next().charAt(0);

                        if (option=='n'){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }else if(option=='y'){
                            System.out.println("Get it in for service.");
                        }
                    }
                }
            }
        }
    }
}
