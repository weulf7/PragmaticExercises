package Functions;

import java.util.Scanner;

public class Exercise24 {
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[]args){
        isAnagram();






    }
    public static void isAnagram(){
        System.out.println("Enter two strings and I'll tell you if they are anagrams:\r");
        System.out.println("Enter the first string:");
        String first = scanner.next();
        System.out.println("Enter the second string:");
        String second = scanner.next();

        if (first.length()==second.length()){
            System.out.println("'"+first+"'"+" and "+"'"+second+"'"+" are anagrams.");
        }else{
            System.out.println("'"+first+"'"+" and "+"'"+second+"'"+" are not anagrams.");

        }


    }



}
