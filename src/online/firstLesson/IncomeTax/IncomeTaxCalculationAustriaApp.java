package online.firstLesson.IncomeTax;

import java.util.Scanner;

public class IncomeTaxCalculationAustriaApp {


    public static void main(String[] args) throws IncomeBelowZero {

        Scanner input = new Scanner(System.in);
        System.out.println("\nJahresabrechnung Pro 7.0 für €\n");
        System.out.println("Guten Tag. Bitte Monatsgehalt in € angeben:");
        double monthlyIncome = Double.parseDouble(input.nextLine());

        new IncomeTaxCalculationAustria(monthlyIncome);
    }
}
