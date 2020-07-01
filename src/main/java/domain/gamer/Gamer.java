package domain.gamer;

import domain.card.deck.Deck;

public class Gamer {
	private final Name name;
	private final Hand hand;
	private final BattingMoney battingMoney;

	private Gamer(Name name, Hand hand, BattingMoney battingMoney) {
		this.name = name;
		this.hand = hand;
		this.battingMoney = battingMoney;
	}

	public static Gamer of(String name, Hand hand, int battingMoney) {
		return new Gamer(new Name(name), hand, new BattingMoney(battingMoney));
	}

	public void hit(Deck deck) {
		hand.add(deck.pop());
	}

	public Name getName() {
		return name;
	}

	public Hand getHand() {
		return hand;
	}

	public BattingMoney getBattingMoney() {
		return battingMoney;
	}
}
