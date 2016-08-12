import java.util.*;

public class Card {

	public enum Suit {
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	public enum Rank {
		DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	private final Rank rank;
	private final Suit suit;
	int value;
	
//    public Rank rank() { return rank; }
//    public Suit suit() { return suit; }
//    public String toString() { return rank + " of " + suit; }

	 private Card(Rank rank, Suit suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	private static final List<Card> deck = new ArrayList<Card>();
	
	static {
		for(Suit suit : Suit.values())
			for(Rank rank : Rank.values())
				deck.add(new Card(rank, suit));
	}
		
	
}
