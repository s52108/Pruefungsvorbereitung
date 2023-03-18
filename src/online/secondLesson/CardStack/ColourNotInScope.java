package online.secondLesson.CardStack;

public class ColourNotInScope extends Exception {
    public ColourNotInScope(String colour) {
        super("<<Fehler>> " + colour + " ist keine erlaubte Farbe.");
    }
}
