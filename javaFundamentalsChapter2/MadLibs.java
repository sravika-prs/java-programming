package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args []){
        /* Algorithm:
        1. Display a welcome message
        2. Ask user for season of the year
        3. Ask user for a whole number
        4. Ask user for adjective
        5. Display "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee
        * */

        Scanner scanner = new Scanner(System.in);

        //Task #1:
        System.out.println("Welcome! Let's play Mad Libs");

        //Task #2:
        System.out.println("Enter a season of the year: ");
        String season = scanner.next();

        //Task #3:
        System.out.println("Enter a whole number: ");
        int num = scanner.nextInt();

        //Task #4:
        System.out.println("Enter an adjective: ");
        String adj = scanner.next();
        scanner.close();

        //Task #5:
        System.out.println("Your Mad Lib result: " + "On a "+adj+" "+season+" day, I drink a minimum of "+num+" cups of coffee.");

    }
}