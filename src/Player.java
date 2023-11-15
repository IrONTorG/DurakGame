import java.util.ArrayList;

class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

}
