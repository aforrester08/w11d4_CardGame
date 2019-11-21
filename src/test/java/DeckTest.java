import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canPopulate() {
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canShuffle() {
        deck.populate();
        Card cardAfterPopulate = deck.topCard();
        deck.shuffle();
        assertNotEquals(cardAfterPopulate, deck.topCard());
    }

    @Test
    public void canDealTopCard() {
        deck.populate();
        Card cardOne = deck.topCard();
        Card card = deck.dealCard();
        assertEquals(cardOne, card);
        assertEquals(51, deck.cardCount());
    }
}
