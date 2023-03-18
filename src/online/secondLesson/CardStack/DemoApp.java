package online.secondLesson.CardStack;

public class DemoApp {
    public static void main(String[] args) throws ColourNotInScope, NumberNotInScope {
        System.out.println("Hello World!");

        Card card1 = new Card(5, "yellow");
        Card card2 = new Card(6, "green");
        Card card3 = new Card(7, "yellow");
        Card card4 = new Card(3, "blue");
        Card card5 = new Card(1, "blue");

        System.out.println("card1 = " + card1);
        System.out.println("card2 = " + card2);
        System.out.println("card3 = " + card3);
        System.out.println("card4 = " + card4);
        System.out.println("card5 = " + card5);

        Card[] array = new Card[8];
        CardStack cardStack = new CardStack(array);
        cardStack.push(card1);
        cardStack.push(card2);
        cardStack.push(card3);
        cardStack.push(card4);
        cardStack.push(card5);

        System.out.println("cardStack = " + cardStack.toString());

        Card c1 = cardStack.pop();
        System.out.println(c1);
        Card c2 = cardStack.pop();
        System.out.println(c2);
        System.out.println("cardStack = " + cardStack.toString());
        cardStack.push(card4);
        cardStack.push(card5);
        cardStack.push(card2);
        Card c3 = cardStack.pop();
        System.out.println(c3);
        System.out.println("cardStack = " + cardStack.toString());
        cardStack.push(card4);
        cardStack.push(card5);
        cardStack.push(card2);



    }
}
