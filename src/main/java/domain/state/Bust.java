package domain.state;

import domain.gamer.Hand;

public class Bust extends Finished {
	public Bust(Hand hand) {
		super(hand);
	}

	@Override
	public double getEarningRate() {
		return 0;
	}
}
