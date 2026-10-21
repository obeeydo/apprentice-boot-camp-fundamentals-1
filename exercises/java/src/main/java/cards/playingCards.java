package cards;

public class playingCards {

    String faceValue;
    String suit;

    public playingCards(int faceValue, String suit) {
        this.suit = suit;
        switch (faceValue) {
            case 1:  this.faceValue = "ace"; break;
            case 11: this.faceValue = "jack"; break;
            case 12: this.faceValue = "queen"; break;
            case 13: this.faceValue = "king"; break;
            default: this.faceValue = String.valueOf(faceValue); break;
        }
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    public static void main(String[] args) {
        playingCards aceHearts = new playingCards(1, "hearts");
        playingCards tenSpades = new playingCards(10, "spades");
        playingCards twoClubs = new playingCards(2, "clubs");

        System.out.println(aceHearts);
        System.out.println(tenSpades);
        System.out.println(twoClubs);
    }
}
