import java.util.Random;

enum Suit {
    SPADE, HEART, DIAMOND, CLUB;

    private static final Random RANDOM = new Random();
    private static final Suit[] SUITS = values();
    private static final int SIZE = SUITS.length;

    public static Suit getRandomType(){
        return SUITS[RANDOM.nextInt(SIZE)];
    }

}
