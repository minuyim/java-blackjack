package domain.state;

import domain.gamer.Hand;

public class Stay extends Finished {
	private static final int NORMAL_RATE = 1;

	public Stay(Hand hand) {
		super(hand);
	}

	@Override
	public double getEarningRate() {
		return NORMAL_RATE;
	}
}
