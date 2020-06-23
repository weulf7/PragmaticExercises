package Exercise10;

import java.util.Scanner;

public class Problem {
    public void start(){

        int firstPrice = firstItemPrice();
        int firstQuantity = firstItemQuantity();
        int secondPrice = secondItemPrice();
        int secondQuantity = secondItemQuantity();
        int thirdPrice = thirdItemPrice();
        int thirdQuantity = thirdItemQuantity();

        double subtotal = (firstPrice * firstQuantity)+(secondPrice*secondQuantity)+(thirdPrice*thirdQuantity);
        System.out.println("Subtotal: " +subtotal);
        double tax = subtotal %5.5;
        System.out.println("Tax : " +tax);
        double total=subtotal +tax;
        System.out.println("Total : " +total);


    }
    public int firstItemPrice(){
        System.out.println("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        return price;
    }
    public int firstItemQuantity(){
        System.out.println("Enter the quantity of item 1: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        return quantity;
    }
    public int secondItemPrice(){
        System.out.println("Enter the price of item 2: ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        return price;
    }
    public int secondItemQuantity() {
        System.out.println("Enter the quantity of item 2: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        return quantity;
    }
    public int thirdItemPrice(){
        System.out.println("Enter the price of item 3 : ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        return price;
    }
    public int thirdItemQuantity(){
        System.out.println("Enter the quantity of item 3: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        return quantity;
    }
}
