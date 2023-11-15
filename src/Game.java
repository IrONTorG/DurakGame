class Game {

    private Player player1;

    private Player player2;

    private Deck deck;

    private Suit trump;

    private boolean isOver;

    public boolean isOver() {
        return isOver;
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 6; i++) {
            player1.addCard(deck.getCard());
        }

        for (int i = 0; i < 6; i++) {
            player2.addCard(deck.getCard());    //kalshk)
        }

        this.trump = Suit.getRandomType();

    }



    public void startGame(){
        while(player1.getHand() != 0 && player2.getHand() != 0){
        }
    }





}
