package online.firstLesson.LeapYear;

public class NotAValidYearException extends Exception{
    public NotAValidYearException(int inputYear) {
        super("<<< Fehler >>> Das von Ihnen angegebene Jahr " + inputYear + " ist ausserhalb der berechenbaren Jahre. Berechnung nicht möglich.");
    }
}
