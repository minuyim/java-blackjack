package controller;

import static java.util.stream.Collectors.*;

import java.util.List;

import domain.card.deck.Deck;
import domain.card.deck.DeckFactory;
import domain.card.deck.RandomShuffledDeckFactory;
import domain.gamer.Dealer;
import domain.gamer.Player;
import domain.gamer.Players;
import dto.GamerDto;
import dto.GamerEarningDto;
import dto.GamerWithScoreDto;
import dto.PlayerInfo;
import view.InputView;
import view.OutputView;

public class BlackJackController {
	private final InputView inputView;
	private final OutputView outputView;

	public BlackJackController(InputView inputView, OutputView outputView) {
		this.inputView = inputView;
		this.outputView = outputView;
	}

	public void run() {
		List<PlayerInfo> playerInfos = inputView.inputPlayerInfos();
		DeckFactory randomShuffledDeckFactory = new RandomShuffledDeckFactory();
		Deck deck = randomShuffledDeckFactory.create();

		Players players = playerInfos.stream()
			.map(playerInfo -> Player.of(playerInfo.getName(), deck, playerInfo.getBattingMoney()))
			.collect(collectingAndThen(toList(), Players::new));
		Dealer dealer = Dealer.of(deck);

		outputView.printGamersCards(GamerDto.listOf(dealer, players.getPlayers()));

		for (Player player : players.getPlayers()) {
			while (player.canHit()) {
				YesOrNo yesOrNo = YesOrNo.findByShortName(inputView.inputYesOrNo(player.getName()));
				yesOrNo.execute(player, deck);
				outputView.printGamerCards(GamerDto.of(player));
			}
		}

		while (dealer.canHit()) {
			outputView.printDealerHit();
			dealer.hit(deck);
		}

		outputView.printGamersCardsWithScore(GamerWithScoreDto.listOf(dealer, players.getPlayers()));
		outputView.printEarning(GamerEarningDto.listOf(dealer, players));
	}
}
