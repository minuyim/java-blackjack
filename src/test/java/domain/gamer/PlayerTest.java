package domain.gamer;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import domain.card.deck.TestDeckFactory;

public class PlayerTest {
	@Test
	void constructor() {
		assertThat(Player.of("사람", new TestDeckFactory().create(), 10_000)).isNotNull();
	}
}
