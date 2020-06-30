package domain.card;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {
	@Test
	@DisplayName("생성 테스트")
	void constructor() {
		assertThat(new Card(Rank.ACE, Suit.SPADE)).isNotNull();
	}
}
