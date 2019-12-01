package chapter2;

/*
Author: Sravika Nimmala
Date: 12/1/2019
*/

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String arg[]){
        /*Algorithm:
        1. Get the number of hours worked
        2. Get the hourly pay rate
        3. Multiply hours and pay rate
        4. Display result
         */
        Scanner scanner = new Scanner(System.in);

        //Task #1:
        System.out.println("Enter the number of hours the employee worked: ");
        int hours = scanner.nextInt();

        // Task #2:
        System.out.println("Enter the employee's pay rate: ");
        double rate = scanner.nextDouble();
        scanner.close();

        // Task #3:
        double grossPay = hours * rate;

        // Task #4:
        System.out.println("Gross Pay: " + grossPay);


    }
}
