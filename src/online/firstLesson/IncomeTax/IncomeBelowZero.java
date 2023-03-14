package online.firstLesson.IncomeTax;

public class IncomeBelowZero extends Exception {

    public IncomeBelowZero(double income) {
        super("<<< Fehler >>> Das Monatseinkommen " + income + " € ist < 0 €. Berechnung nicht möglich.");
    }
}
