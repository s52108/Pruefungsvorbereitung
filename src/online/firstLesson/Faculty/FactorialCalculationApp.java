package online.firstLesson.Faculty;

import java.util.Scanner;

public class FactorialCalculationApp {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner input = new Scanner(System.in);
        System.out.println("Guten Tag. Bitte Zahl eingeben:");
        long inputYear = Long.parseLong(input.nextLine());
        new FacultyCalculation(inputYear);
    }
}
