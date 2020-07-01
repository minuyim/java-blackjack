package domain.gamer;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.card.Card;
import domain.card.Rank;
import domain.card.Suit;
import domain.card.deck.DeckFactory;
import domain.card.deck.TestDeckFactory;

public class GamerTest {
	@Test
	@DisplayName("생성 테스트")
	void constructor() {
		List<Card> cards = Arrays.asList(new Card(Rank.ACE, Suit.SPADE), new Card(Rank.EIGHT, Suit.SPADE));
		assertThat(Gamer.of("사람", new Hand(cards), 10_000)).isNotNull();
	}

	@Test
	@DisplayName("게이머가 히트할 수 있는지 확인")
	void hit() {
		List<Card> cards = new ArrayList<>(Arrays.asList(new Card(Rank.ACE, Suit.SPADE), new Card(Rank.EIGHT, Suit.SPADE)));
		Gamer gamer = Gamer.of("사람", new Hand(cards), 10_000);
		DeckFactory testDeckFactory = new TestDeckFactory();
		gamer.hit(testDeckFactory.create());
		assertThat(gamer.getHand().getCards()).hasSize(3);
	}
}
