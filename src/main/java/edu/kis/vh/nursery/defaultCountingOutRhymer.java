package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int BEGIN = -1;

	private int[] NUMBERS = new int[12];

    public int total = BEGIN;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == BEGIN;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return BEGIN;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return BEGIN;
                        return NUMBERS[total--];
                    }

}
