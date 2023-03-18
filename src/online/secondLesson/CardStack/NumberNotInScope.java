package online.secondLesson.CardStack;

public class NumberNotInScope extends Exception {

    public NumberNotInScope(int value) {
        super("Fehler - " + value + " liegt ausserhalb des zulässigen Bereichs.");
    }
}
