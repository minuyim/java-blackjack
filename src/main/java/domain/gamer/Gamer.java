package domain.gamer;

import domain.card.Card;
import domain.card.PlayingCards;

public abstract class Gamer {
    final PlayingCards playingCards;
    final String name;

    public Gamer(PlayingCards playingCards, String name) {
        this.playingCards = playingCards;
        this.name = name;
    }

    public void addCard(Card card) {
        playingCards.add(card);
    }

    public int calculateScore() {
        return playingCards.calculateScore();
    }

    public int countCards() {
        return playingCards.countCards();
    }

    public boolean isBust() {
        return playingCards.isBust();
    }

    public boolean isNotBust() {
        return playingCards.isBust();
    }

    public String getName() {
        return name;
    }

    public PlayingCards getPlayingCards() {
        return playingCards;
    }
}
