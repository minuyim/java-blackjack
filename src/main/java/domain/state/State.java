package domain.state;

import java.util.List;

import domain.card.Card;
import domain.card.deck.Deck;

public interface State {
	State hit(Deck deck);

	State stay();

	boolean isFinished();

	double getEarningRate();

	List<Card> getCards();
}
