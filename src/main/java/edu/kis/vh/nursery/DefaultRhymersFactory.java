package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public defaultCountingOutRhymer GetStandardRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFalseRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public defaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
