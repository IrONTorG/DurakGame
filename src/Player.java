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

    public void status (){
        System.out.println("Player name: " + name);
        String str;
        System.out.println("Cards in hands: ");
        for (int i = 0; i < hand.size(); i++){
            str = hand.get(i).stringName();
            if(i < hand.size() - 1) {
                System.out.print(str + ", ");
            }
            else System.out.print(str + "\n" + "\n");
        }


    }



    public int getHandSize(){
        return hand.size();
    }

    public Card getHand(int i){
        return hand.get(i);
    }

    public String getName(){
        return name;
    }
}
