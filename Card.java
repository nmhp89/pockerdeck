public class Card {
    private String palo; 
    private String color; 
    private String value; 

    public Card(String palo, String color, String value) {
        this.palo = palo;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return palo + ", " + color + ", " + value;
    }
}
