package edu.kis.vh.nursery;
// projekt jest poprawny
public class defaultCountingOutRhymer {

  private static final int CAPACITY = 12;
  private static final int GUARD = 11;

  private static final int INITIAL_VALUE = -1;

  private final int[] NUMBERS = new int[CAPACITY];

  public int total = INITIAL_VALUE;

  public void countIn(int in) {
    if (!isFull()) NUMBERS[++total] = in;
  }

  public boolean callCheck() {
    return total == INITIAL_VALUE;
  }

  public boolean isFull() {
    return total == GUARD;
  }

  private static final int IF_EMPTY = -1;

  protected int peekaboo() {
    if (callCheck()) return IF_EMPTY;
    return NUMBERS[total];
  }

  public int countOut() {
    if (callCheck()) return IF_EMPTY;
    return NUMBERS[total--];
  }
}
class HanoiRhymer extends defaultCountingOutRhymer {

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
