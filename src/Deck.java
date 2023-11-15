import javax.swing.text.Caret;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


class Deck {
    private Stack<Card> cards;

    public Deck() {

        cards = new Stack<Card>();
        Suit[] suits = {Suit.HEART, Suit.DIAMOND, Suit.CLUB, Suit.SPADE};
        Rank[] ranks = {Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING, Rank.ACE};

        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    


}



