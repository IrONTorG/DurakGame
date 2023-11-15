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

    public void Status (){
        System.out.println(); //вывод инфы о картах в руке, кол-ве
    }

    public int getHand(){
        return hand.size();
    }

}
