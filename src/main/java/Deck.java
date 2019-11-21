import java.util.*;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void populate() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                this.cards.add(new Card(suit, rank));
            }
        }
    }
    
    public Card topCard() {
        return this.cards.get(0);
    }

    public void shuffle() {

        populate();
        Random rand = new Random();

        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        for (int i=0; i<52; i++){
            Card card = this.cards.remove(rand.nextInt(cardCount()));
            shuffledDeck.add(card);
        }
        this.cards = shuffledDeck;
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }
}
