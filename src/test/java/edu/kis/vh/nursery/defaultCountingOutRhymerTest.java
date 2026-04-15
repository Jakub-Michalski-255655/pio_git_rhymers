package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class defaultCountingOutRhymerTest {
    @Test
    public void testCountIn() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);
        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsFull() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        for (int i = 0; i < 12; i++) {
            rhymer.countIn(i);
        }
        Assert.assertTrue(rhymer.isFull());
    }

    @Test
    public void testCountOut() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        rhymer.countIn(10);
        int result = rhymer.countOut();
        Assert.assertEquals(10, result);
        Assert.assertEquals(-1, rhymer.countOut()); // Sprawdzenie pustego stosu
    }
}