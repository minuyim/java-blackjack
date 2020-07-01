package domain.gamer;

import domain.card.deck.Deck;
import domain.state.State;
import domain.state.StateFactory;

public class Gamer {
	private final Name name;
	private State state;
	private final BattingMoney battingMoney;

	private Gamer(Name name, State state, BattingMoney battingMoney) {
		this.name = name;
		this.state = state;
		this.battingMoney = battingMoney;
	}

	public static Gamer of(String name, Deck deck, int battingMoney) {
		return new Gamer(new Name(name), StateFactory.create(deck), new BattingMoney(battingMoney));
	}

	public void hit(Deck deck) {
		state = state.hit(deck);
	}

	public Name getName() {
		return name;
	}

	public State getState() {
		return state;
	}

	public BattingMoney getBattingMoney() {
		return battingMoney;
	}
}
