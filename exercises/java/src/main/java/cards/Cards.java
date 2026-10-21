package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52 ];
        int[][] deck = new int[52][2];
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 1; faceValue <= 13; faceValue++) {
                deck[suit * 13 + (faceValue - 1) ] = new int[]{suit, faceValue};
            }
        }
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        int cardNumber = 0;
        for (int[] card : deck) {
            int suitIndex = card[0];

            int faceValueNum = card[1];

            playingCards cardObject = new playingCards(faceValueNum, suits[suitIndex]);
            result[cardNumber] = cardObject.toString();
            cardNumber++;
        }

        return result;
    }

}
