package domain.gamer;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import domain.card.deck.Deck;
import domain.card.deck.TestDeckFactory;

public class DealerTest {
	@Test
	void constructor() {
		Deck deck = new TestDeckFactory().create();
		assertThat(Dealer.of(deck)).isNotNull();
	}
}
