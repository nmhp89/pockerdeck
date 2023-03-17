public class Main {
    public static void main(String[] args) {
        
        Deck deck = new Deck(); // Crea una nueva instancia de la clase Deck

        System.out.println("- Deck List -");
        deck.listDeck(); // Muestra las cartas en Deck

        System.out.println("- head() -");
        deck.head();     // Toma la primer carta del Deck
        System.out.println("- Deck List -");
        deck.listDeck(); // Muestra las cartas en Deck
        
        System.out.println("- pick() -");
        deck.pick();     // Toma una carta aleatoria del Deck
        System.out.println("- Deck List -");
        deck.listDeck(); // Muestra las cartas en Deck
        
        System.out.println("- hand() -");
        deck.hand();     // Toma las primeras 5 cartas del Deck
        System.out.println("- Deck List -");
        deck.listDeck(); // Muestra las cartas en Deck
        
        System.out.println("- shuffle() -");
        deck.shuffle();  // Mezcla las cartas en el Deck
        System.out.println("- Deck List -");
        deck.listDeck(); // Muestra las cartas en Deck
    }
}

