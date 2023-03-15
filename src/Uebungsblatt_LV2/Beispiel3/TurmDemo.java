package Uebungsblatt_LV2.Beispiel3;

public class TurmDemo {
    public static void main(String[] args) {
        int zahl = 2;
        int ergebnis = zahl;

        System.out.println(zahl);

        int i = 2;
        while (i <= 9) {
            System.out.print(ergebnis + " * " + i + " = ");
            ergebnis = ergebnis * i;
            System.out.println(ergebnis);

            i++;
        }

        i = 2;
        while (i <= 9) {
            System.out.print(ergebnis + " / " + i + " = ");
            ergebnis = ergebnis / i;
            System.out.println(ergebnis);
            i++;
        }
    }
}
