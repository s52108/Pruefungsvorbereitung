package Uebungslatt_LV1;

import java.util.Scanner;

public class RechteckDemo {
    public static void main(String[] args) throws RechteckDemoFehler {

        Scanner input = new Scanner(System.in);

        System.out.println("Herzlich willkommen zur Berechnung von Umfang und Fläche eines rechtwinkligen Vierecks.");
        System.out.println("Bitte geben sie die erste Seitenlänge ein:");
        int laenge = Integer.parseInt(input.nextLine());
        if (laenge <= 0) {
            throw new RechteckDemoFehler(laenge);
        }
        System.out.println("Bitte geben sie die zweite Seitenlänge ein:");
        int breite = Integer.parseInt(input.nextLine());
        if (breite <= 0) {
            throw new RechteckDemoFehler(breite);
        }


        int umfang = (laenge + breite) * 2;
        int flaeche = laenge * breite;

        if (laenge != breite) {
            System.out.println("Die länge des Rechtecks beträgt " + laenge + " m, die Breite beträgt " + breite + " m.");
            System.out.println("Der Umfang des Rechtecks beträgt " + umfang + " m, die Fläche beträgt " + flaeche + " m².");
        } else {
            System.out.println("Die Seitenlänge des Quadrats beträgt " + laenge + " m.");
            System.out.println("Der Umfang des Quadrats beträgt " + umfang + " m, die Fläche beträgt " + flaeche + " m².");

        }
    }
}
