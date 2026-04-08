package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	private static final int ZERO = 0;
	int totalRejected = ZERO;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
