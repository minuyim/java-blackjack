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
		assertThat(Gamer.of("사람", new TestDeckFactory().create(), 10_000)).isNotNull();
	}

	@Test
	@DisplayName("게이머가 hit할 수 있는지 확인")
	void hit() {
		List<Card> cards = new ArrayList<>(Arrays.asList(new Card(Rank.ACE, Suit.SPADE), new Card(Rank.EIGHT, Suit.SPADE)));
		DeckFactory testDeckFactory = new TestDeckFactory();
		Gamer gamer = Gamer.of("사람", testDeckFactory.create(), 10_000);
		gamer.hit(testDeckFactory.create());
		assertThat(gamer.getState().getCards()).hasSize(3);
	}
}
