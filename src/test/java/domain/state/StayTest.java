package domain.state;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.card.Card;
import domain.card.Rank;
import domain.card.Suit;
import domain.gamer.Hand;

public class StayTest {
	@Test
	@DisplayName("승리시 얻는 상금 비율을 확인")
	void getEarningRate() {
		assertThat(new Stay(
			new Hand(
				Arrays.asList(new Card(Rank.EIGHT, Suit.SPADE),
					new Card(Rank.NINE, Suit.CLUB)))).getEarningRate()).isEqualTo(1);
	}
}
