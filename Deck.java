import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
        String[] palos = { "Trebol", "Corazón", "Picas", "Diamantes" };
        String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        for (String palo : palos) {
            String color = (palo.equals("Trebol") || palo.equals("Picas")) ? "Negro" : "Rojo";
            for (String valor : valores) {
                Card card = new Card(palo, color, valor);
                this.deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.\n");
    }

    public void head() {
        Card card = deck.remove(0);
        System.out.println(card.toString() + "\nQuedan " + deck.size() + "\n");
    }

    public void pick() {
        int randomIndex = (int) (Math.random() * deck.size());
        Card card = deck.remove(randomIndex);
        System.out.println(card.toString() + "\nQuedan " + deck.size() + "\n");
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            Card card = deck.remove(0);
            System.out.println(card.toString());
        }
        System.out.println("Quedan " + deck.size() + "\n");
    }

    public void listDeck() {
        for (Card card : deck) {
            System.out.println(card.toString());
        }
        System.out.print("\n");
    }
}
