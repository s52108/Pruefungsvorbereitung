package online.secondLesson.CardStack;

import java.util.Arrays;

public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(Card newCard) {
        if (cards.length > counter + 1) {
            counter++;
            cards[counter] = newCard;
        } else throw new StackOverflowError();

    }

    public Card pop() {
        if (counter >= 0) {
            Card result = cards[counter];
            //cards[counter] = null;
            counter--;
            return result;
        } else {
            return null;
        }

    }


    @Override
    public String toString() {
        return "CardStack{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
