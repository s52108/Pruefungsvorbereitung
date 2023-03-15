package Uebungslatt_LV1;

public class RechteckDemoFehler extends Exception {

    public RechteckDemoFehler(int input) {
        super(">>Fehler<< die Seitenlänge " + input + " darf nicht <= 0 sein");
    }
}
