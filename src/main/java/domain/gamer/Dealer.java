package domain.gamer;

import domain.card.deck.Deck;
import domain.state.State;
import domain.state.StateFactory;

public class Dealer extends Gamer {
	private Dealer(State state) {
		super(new Name("딜러"), state);
	}

	public static Dealer of(Deck deck) {
		return new Dealer(StateFactory.create(deck));
	}
}
