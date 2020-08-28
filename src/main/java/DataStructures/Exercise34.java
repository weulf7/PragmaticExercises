package DataStructures;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise34 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
removeEmployee();
    }

    private static void removeEmployee(){
        ArrayList<String>employees=new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("These are the "+employees.size()+" employees:");
        for (int i=0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }

        System.out.println("Enter the name of the employee y ou want to remove:");
        String removal = scanner.nextLine();

        for (int i=0;i<employees.size();i++){
            if (employees.get(i).equals(removal)){
                employees.remove(i);
                break;
            }
        }
        System.out.println("The are the "+employees.size()+" employees:");
        for (int i=0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }
    }
}
