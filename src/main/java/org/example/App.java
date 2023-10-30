package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your income (rounded to the nearest whole number: ");
        int salary = sc.nextInt();

        int[] outSalary = Taxes.CheckBracket(salary);
        int takeHome = Taxes.CalcTakeHome(outSalary);


        System.out.println("Take home pay is: " + takeHome);
        System.out.println("The tax ammount is: " + (salary - takeHome));
    }
}
