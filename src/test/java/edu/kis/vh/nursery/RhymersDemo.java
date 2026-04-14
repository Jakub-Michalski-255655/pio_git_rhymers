package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	private static final int RANGE_OF_RANDOM_NUMBER = 20;
	private static final int FIRST_RHYMER = 0;
	private static final int RHYMERS_AMOUNT = 3;
	private static final int COUNT_END = 15;
	private static final int COUNT_BEGIN = 1;

	public static void main(String[] args) {
		testRhymers();

	}

	private static void testRhymers() {
		Rhymersfactory factory = new DefaultRhymersFactory();

		defaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer() };

		for (int i = COUNT_BEGIN; i < COUNT_END; i++)
			for (int j = FIRST_RHYMER; j < RHYMERS_AMOUNT; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = COUNT_BEGIN; i < COUNT_END; i++)
			rhymers[RHYMERS_AMOUNT].countIn(rn.nextInt(RANGE_OF_RANDOM_NUMBER));

		for (int i = FIRST_RHYMER; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[RHYMERS_AMOUNT]).reportRejected());
	}

}