package domain.card;

import java.util.Objects;

public class Card {
	private final Rank rank;
	private final Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public boolean isAce() {
		return rank == Rank.ACE;
	}

	public int getScore() {
		return rank.getValue();
	}

	public String getRank() {
		return rank.getPattern();
	}

	public String getSuit() {
		return suit.getPattern();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Card card = (Card)o;
		return rank == card.rank &&
			suit == card.suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}
}
