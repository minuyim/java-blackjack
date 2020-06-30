package domain.gamer;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.card.Card;
import domain.card.Rank;
import domain.card.Suit;

public class HandTest {
	@Test
	@DisplayName("생성 테스트")
	void constructor() {
		assertThat(new Hand(Arrays.asList(new Card(Rank.EIGHT, Suit.SPADE), new Card(Rank.EIGHT, Suit.CLUB)))).isNotNull();
	}

	@Test
	void addCard() {
		Hand hand = new Hand(Arrays.asList(new Card(Rank.EIGHT, Suit.SPADE), new Card(Rank.EIGHT, Suit.CLUB)));
		hand.add(new Card(Rank.ACE, Suit.SPADE));
		assertThat(hand.getCards()).hasSize(3);
	}
}
