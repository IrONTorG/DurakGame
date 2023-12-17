import java.util.Scanner;

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
            player2.addCard(deck.getCard());
        }

        this.trump = Suit.getRandomType();

    }


    public void startGame() {
        System.out.println("Trump is: " + trump + "\n");
        int maxTrumpP1 = 0;
        int maxTrumpP2 = 0;
        for (int i = 0; i < player1.getHandSize(); i++) {
            if (player1.getHand(i).getSuit() == trump) {
                if (player1.getHand(i).getRankInt() > maxTrumpP1) {
                    maxTrumpP1 = player1.getHand(i).getRankInt();
                }

            }
        }
        for (int i = 0; i < player2.getHandSize(); i++) {
            if (player2.getHand(i).getSuit() == trump) {
                if (player2.getHand(i).getRankInt() > maxTrumpP2) {
                    maxTrumpP2 = player2.getHand(i).getRankInt();
                }

            }
        }
        if (maxTrumpP2 > maxTrumpP1) {
            Player temp = player1;
            player1 = player2;
            player2 = temp;

        }
        while (player1.getHandSize() != 0 && player2.getHandSize() != 0) {
            player1.status();
            player2.status();

            break;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Player " + player1.getName() + " choose card");


        int chooseP1 = input.nextInt();
        System.out.println(player1.getHand(chooseP1 - 1).stringName());


        System.out.println("Player " + player2.getName() + " choose card");
        int chooseP2 = input.nextInt();
        System.out.println(player2.getHand(chooseP2 - 1).stringName());

        if (player1.getHand(chooseP1).getSuitString() == player2.getHand(chooseP2).getSuitString() && player2.getHand(chooseP2).getRankInt() > player1.getHand(chooseP1).getRankInt()) {

            System.out.println("pobeda!)");
        } else System.out.println("proigrl");
    }

}







