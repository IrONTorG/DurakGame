class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public int getRankInt(){
        switch (this.rank){
            case SIX -> {
                return 6;
            }
            case SEVEN -> {
                return 7;
            }
            case EIGHT -> {
                return 8;
            }
            case NINE -> {
                return 9;
            }
            case TEN -> {
                return 10;
            }
            case JACK  -> {
                return 11;
            }
            case QUEEN -> {
                return 12;
            }
            case KING -> {
                return 13;
            }
            case ACE -> {
                return 14;
            }
            default -> {
                return 0;
            }

        }
    }

}
