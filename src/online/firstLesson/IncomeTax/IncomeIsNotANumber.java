package online.firstLesson.IncomeTax;

public class IncomeIsNotANumber extends Exception {

    public IncomeIsNotANumber() {
        super("<<< Fehler >>> Das Monatseinkommen muss eine Zahl sein. Berechnung nicht möglich.");
    }
}

