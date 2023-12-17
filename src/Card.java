class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String stringName(){
        return this.getRankString() + " OF " + this.getSuitString();
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

    public String getSuitString() {
        switch (this.suit) {
            case SPADE -> {
                return "SPADE";
            }
            case HEART -> {
                return "HEART";
            }
            case DIAMOND -> {
                return "DIAMOND";
            }
            case CLUB -> {
                return "CLUB";
            }
            default -> {
                return "UNKNOWN";
            }
        }
    }

    public String getRankString(){
        switch (this.rank){
            case SIX -> {
                return "SIX";
            }
            case SEVEN -> {
                return "SEVEN";
            }
            case EIGHT -> {
                return "EIGHT";
            }
            case NINE -> {
                return "NINE";
            }
            case TEN -> {
                return "TEN";
            }
            case JACK  -> {
                return "JACK";
            }
            case QUEEN -> {
                return "QUEEN";
            }
            case KING -> {
                return "KING";
            }
            case ACE -> {
                return "ACE";
            }
            default -> {
                return "UNKNOWN";
            }

        }
    }

}
