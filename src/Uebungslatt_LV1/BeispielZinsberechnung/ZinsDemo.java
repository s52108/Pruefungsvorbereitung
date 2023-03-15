package Uebungslatt_LV1.BeispielZinsberechnung;

import static java.lang.Math.round;

public class ZinsDemo {
    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 2.25;
        int laufzeit = 1;

        Zinsberechnung(kontostand, zinsen, laufzeit);
        Zinsberechnung(10000, 2.25, 5);
        Zinsberechnung(100000, 5, 10);

    }

    public static void Zinsberechnung(double kontostand, double zinsen, int laufzeit) {
        System.out.println("Ihr kontostand beträgt " + kontostand + " €. Ihre Zinsen liegen bei " + zinsen + " %. ");
        System.out.println("Ihre Laufzeit beträgt " + laufzeit + " Jahre.");
        for (int i = 0; i <= laufzeit; i++) {
            kontostand = kontostand * (1 + (zinsen / 100));
        }
        System.out.println("Ihr Kontostand nach " + laufzeit + " Jahr(en) beträgt " + round(kontostand) + " €.\n");


    }
}
