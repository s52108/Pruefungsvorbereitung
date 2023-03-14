package online.firstLesson.IncomeTax;

import java.text.DecimalFormat;

import static java.lang.Math.round;

public class IncomeTaxCalculationAustria {

    /*
                     < 11.000 €       -> Steuerfrei
        > 11.000 € & < 18.000 €       -> 20%
        < 18.000 € & < 31.000 €       -> 32.5%
        > 31.000 € & < 60.000 €       -> 42%
        > 60.000 € & < 90.000 €       -> 48%
        > 90.000 € & < 1.000.000 €    -> 50%
        >1.000.000                    -> 55%

        SV Beitrag: 18,12%


        Beispiel:
        Monatsgehalt = 2900€
        Jahresgehalt = Monatsgehalt * 14 = 40.600€
        Jahresgehalt - SV = 40.600 - (40.600 * 18,12) = 40.600 - 7.356,72 = 33.243,28€

        Steuern:
        bis 11.000€ -> 0 %
        11.000 € - 18.000 € -> 7.000 € * 0,2 = 1.400 €
        18.000 € - 31.000 € -> 13.000 € * 0,325 = 4.225€
        31.000 € - 33.243 € -> 2.243 € * 0,42 = 942.06 €

        = 6.567,06 €

         */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public IncomeTaxCalculationAustria(double monthlyIncome) throws IncomeBelowZero {
        //Definition der Steuerklassen anhand des kleinsten Wertes, welcher in die jew. Steuerklasse fällt
        double class0Min = 0;
        double class1Min = 11000;
        double class2Min = 18000;
        double class3Min = 31000;
        double class4Min = 60000;
        double class5Min = 90000;
        double class6Min = 1000000;

        //Definition der Prozentsätze je Steuerklasse
        double class0Percent = 0.0;
        double class1Percent = 0.2;
        double class2Percent = 0.325;
        double class3Percent = 0.42;
        double class4Percent = 0.48;
        double class5Percent = 0.50;
        double class6Percent = 0.55;

        //Berechnung der max. Abgabe für die Steuerklassen 1 bis 5
        double class1TaxMax = (class2Min - class1Min) * class1Percent;
        double class2TaxMax = (class3Min - class2Min) * class2Percent;
        double class3TaxMax = (class4Min - class3Min) * class3Percent;
        double class4TaxMax = (class5Min - class4Min) * class4Percent;
        double class5TaxMax = (class6Min - class5Min) * class5Percent;

        double socialSecurityPercent = 0.1812;

        double completeTaxAmount = 0;
        double yearlyIncomeBeforeSV = monthlyIncome * 14;


        System.out.println("\nJahresabrechnung Pro 7.0 für €\n");


        double yearlyIncome = yearlyIncomeBeforeSV * (1 - socialSecurityPercent);

        if (yearlyIncome < 0) {
            throw new IncomeBelowZero(monthlyIncome);
        }

        System.out.println("Einkommen pro Monat = " + df.format(monthlyIncome) + "€\n");
        System.out.println("Einkommen pro Jahr vor Abzug der SV Beiträge = " + df.format(yearlyIncomeBeforeSV) + "€");
        System.out.println("Einkommen pro Jahr abzüglich SV Beiträge = " + df.format(yearlyIncome) + "€\n");


        //Gehalt < 0


        //Gehalt < class1Min
        if (yearlyIncome > class0Min && yearlyIncome < class1Min) {
            completeTaxAmount = (yearlyIncome - class0Min) * class0Percent;
        }

        //Gehalt < class2Min
        if (yearlyIncome > class1Min && yearlyIncome < class2Min) {
            completeTaxAmount = (yearlyIncome - class1Min) * class1Percent;
        }

        //Gehalt < class3Min
        if (yearlyIncome > class2Min && yearlyIncome < class3Min) {
            completeTaxAmount = class1TaxMax + ((yearlyIncome - class2Min) * class2Percent);
        }

        //Gehalt < class4Min
        if (yearlyIncome > class3Min && yearlyIncome < class4Min) {
            completeTaxAmount = class1TaxMax + class2TaxMax + ((yearlyIncome - class3Min) * class3Percent);
        }

        //Gehalt < class5Min
        if (yearlyIncome > class4Min && yearlyIncome < class5Min) {
            completeTaxAmount = class1TaxMax + class2TaxMax + class3TaxMax + ((yearlyIncome - class4Min) * class4Percent);
        }

        if (yearlyIncome > class5Min && yearlyIncome < class6Min) {
            completeTaxAmount = class1TaxMax + class2TaxMax + class3TaxMax + class4TaxMax + ((yearlyIncome - class5Min) * class5Percent);
        }

        if (yearlyIncome > class6Min) {
            completeTaxAmount = class1TaxMax + class2TaxMax + class3TaxMax + class4TaxMax + class5TaxMax + ((yearlyIncome - class6Min) * class6Percent);
        }


        double yearlyIncomeAfterTax = yearlyIncome - completeTaxAmount;
        System.out.println("Die Höhe der Einkommenssteuer beträgt gesamt: " + df.format(completeTaxAmount) + "€");
        System.out.println("Ihr jährliches Einkommen nach Steuern beträgt: " + df.format(yearlyIncomeAfterTax) + "€");


    }
}
