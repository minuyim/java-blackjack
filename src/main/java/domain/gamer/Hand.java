package domain.gamer;

import java.util.List;

import domain.card.Card;

public class Hand {
	private final List<Card> cards;

	public Hand(List<Card> cards) {
		this.cards = cards;
	}

	public void add(Card card) {
		cards.add(card);
	}

	public List<Card> getCards() {
		return cards;
	}
}
