package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int SIZE = 12;

	private static final int ERROR_CODE = -1;

	private int[] NUMBERS = new int[SIZE];

    public int total = ERROR_CODE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == ERROR_CODE;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR_CODE;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERROR_CODE;
                        return NUMBERS[total--];
                    }

}
