package Functions;



import java.util.Scanner;

public class Exercise27 {
private static String first,last,zip,employee;
    public static void main(String[] args) {

        init();
        validator(first,last,zip,employee);

    }
    private static void init (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
         first = scanner.nextLine();

        System.out.println("Enter last name:");
         last = scanner.nextLine();

        System.out.println("Enter ZIP code:");
        zip = scanner.nextLine();

        System.out.println("Enter employee ID:");
        employee = scanner.nextLine();


    }

    private static int firstValidate(String a){
        if (a!=null && a.length()>1){
            return 1;
        }
        else {
            System.out.println("Not valid name,or not filled in!!!");
            return 0;
        }
    }

    private static int lastValidate(String a){
        if (a!=null && a.length()>1){
            return 1;
        }
        else  {
            System.out.println("Not valid name,or not filled in!!!");
            return 0;
        }

    }

    private static int zipValidate(String a){
        if (a!=null && a.matches("(?=.*[0-9]).*")){
            return 1;
        }
        else {
            System.out.println("ZIP code must be numeric!!!");
            return 0;
        }
    }

    private static int idValidate(String a){
        if (a!=null && a.matches("[A-Za-z]{2}[-]{1}(.*)[0-9]{4}")){
            return 1;
        }
        else {
            System.out.println("The ID must contain 2 letter and 4 digits!!!");
            return 0;
        }
    }


    private static void validator(String a,String b,String c,String d){
        if (firstValidate(a)==1 && lastValidate(b)==1 && zipValidate(c)==1 && idValidate(d)==1){
            System.out.println("No error found!");

        }
        else {
            System.out.println("Something went wrong!Try again!");

        }


    }








}
