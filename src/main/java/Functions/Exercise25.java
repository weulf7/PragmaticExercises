package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {
        String password = initPassword();
        passwordValidator(password);

    }

    private static String initPassword(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a password to validate:");
        String psw = scanner.next();
        return psw;
    }

    private static int letterChecker(String psw){
        int a=0;
        if (psw.matches("(?=.*[a-z,A-Z]).*")) {
            a=1;
            return a;
        }
        return a;
    }

    private static int numberChecker(String psw){
        int a=0;
        if (psw.matches("(?=.*[0-9]).*")){
    a=1;
    return a;
        }
        return a;
    }

    private static int specialCharChecker(String psw){
        int a=0;
        if (psw.matches(".*([~!@#$%^&*()_-]).*")){
    a=1;
    return a;
        }
        return a;
    }

    private static int lengthChecker(String psw){
        int value;
        if (psw.length()>8){
            value=1;
            return value;
        }else {
            value=0;
            return value;
        }


    }

    private static void passwordValidator(String psw){
        if (lengthChecker(psw)==0){
            if (numberChecker(psw)==1 && letterChecker(psw)!=1 && specialCharChecker(psw)!=1){
                System.out.println(psw +" is a very weak password.");
            }else if (numberChecker(psw)!=1 && letterChecker(psw)==1 && specialCharChecker(psw)!=1){
                System.out.println(psw+" is a weak password.");
            }

        } else {
            if (numberChecker(psw)==1 && letterChecker(psw)==1 && specialCharChecker(psw)!=1 ) {
                System.out.println(psw+" is a strong password.");
            }else if (numberChecker(psw)==1 && letterChecker(psw)==1 && specialCharChecker(psw)==1 ){
                System.out.println(psw+" is a very strong password");
            }
        }
    }




    }








