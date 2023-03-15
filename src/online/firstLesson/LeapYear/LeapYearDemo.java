package online.firstLesson.LeapYear;

import online.firstLesson.IncomeTax.IncomeBelowZero;

import java.util.Scanner;

public class LeapYearDemo{

    public static void main(String[] args) throws NotAValidYearException {

        Scanner input = new Scanner(System.in);
        System.out.println("Guten Tag. Bitte Jahr eingeben:");
        int inputYear =  Integer.parseInt(input.nextLine());
        new LeapYear(inputYear);
    }
}
