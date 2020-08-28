package DataStructures;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise35 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
pickingWinner();
    }

    private static void pickingWinner(){
        ArrayList<String>nameList=new ArrayList<>();
        Random random=new Random();

        for (int i=0;i<6;i++){
            System.out.println("Enter a name:");
            String names = scanner.nextLine();
            nameList.add(names);
        }

        System.out.println("These are the competitors:");
        for (int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }
        String winner=nameList.get(random.nextInt(nameList.size()));

        System.out.println("And the winner is........"+winner);

    }
}
