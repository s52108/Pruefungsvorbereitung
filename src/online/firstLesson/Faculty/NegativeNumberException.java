package online.firstLesson.Faculty;

public class NegativeNumberException extends Exception{
    public NegativeNumberException(long input) {
        super("<<< Fehler >>> Die Zahl " + input + " ist < 0. Fakultäten im ursprünglichen Sinne sind für negative Zahlen nicht definiert.");
    }
}
