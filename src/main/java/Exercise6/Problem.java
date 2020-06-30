package Exercise6;



import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Problem {

    public void start(){
        Calendar currentYear = Calendar.getInstance();
        int theAge = currentAge();
        int theRetirement = retirement();
        int agesLeft = theRetirement - theAge;
        System.out.println("You have " +agesLeft +" years left, until retirement.");
        System.out.println("It 's "+ currentYear.get(Calendar.YEAR) + " ,so you can retire in "+ (currentYear.get(Calendar.YEAR)+ agesLeft ));

    }
    public int currentAge(){
        System.out.println("What is your current age?:");
        Scanner scanner = new Scanner(System.in);
        int yourAge = scanner.nextInt();
        return yourAge;
    }
    public int retirement(){
        System.out.println("At what age would you like to reitre?:");
        Scanner scanner = new Scanner(System.in);
        int retirementAge = scanner.nextInt();
        return retirementAge;
    }
}
