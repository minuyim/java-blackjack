package domain.gamer;

import domain.card.deck.Deck;
import domain.state.State;

public abstract class Gamer {
	protected final Name name;
	protected State state;

	protected Gamer(Name name, State state) {
		this.name = name;
		this.state = state;
	}

	public void hit(Deck deck) {
		state = state.hit(deck);
	}

	public void stay() {
		state = state.stay();
	}

	public boolean isFinished() {
		return state.isFinished();
	}

	public Name getName() {
		return name;
	}

	public State getState() {
		return state;
	}

	public abstract boolean canHit();
}
