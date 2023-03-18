package online.secondLesson.CardStack;

public class Card {

    private int value;
    private String colour;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Card(int value, String colour) throws NumberNotInScope, ColourNotInScope {

        if (value < 1 || value > 9) {
            throw new NumberNotInScope(value);
        }

        this.value = value;

        if (!(colour.equals("blue") || colour.equals("green") || colour.equals("yellow") || colour.equals("red"))) {
            throw new ColourNotInScope(colour);
        }

        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
