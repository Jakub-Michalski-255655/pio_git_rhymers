package edu.kis.vh.nursery;
// projekt jest poprawny

/**
 * Klasa defaultCountingOutRhymer odpowiada za podstawowe operacje na stosie
 */
public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return NUMBERS[total--];
                    }

  private static final int INITIAL_VALUE = -1;

  private final int[] NUMBERS = new int[CAPACITY];

  public int total = INITIAL_VALUE;

  /**
   * Dodaje nową liczbę do stosu, jeśli nie jest on pełny.
   * @param in Wartość całkowita, która ma zostać dodana.
   */
  public void countIn(int in) {
    if (!isFull()) NUMBERS[++total] = in;
  }
  /**
   * Sprawdza, czy stos jest pusty.
   * @return true, jeśli stos nie zawiera żadnych elementów, w przeciwnym razie false.
   */
  public boolean callCheck() {
    return total == INITIAL_VALUE;
  }
  /**
   * Sprawdza, czy stos osiągnął swoją maksymalną pojemność.
   * @return true, jeśli stos jest pełny, w przeciwnym razie false.
   */
  public boolean isFull() {
    return total == GUARD;
  }

  private static final int IF_EMPTY = -1;
  /**
   * Pozwala podejrzeć ostatnio dodaną wartość bez usuwania jej ze stosu.
   * @return Ostatnia wartość na stosie lub -1, jeśli stos jest pusty.
   */
  protected int peekaboo() {
    if (callCheck()) return IF_EMPTY;
    return NUMBERS[total];
  }
  /**
   * Pobiera i usuwa ostatnią wartość ze stosu.
   * @return Ostatnia wartość ze stosu lub -1, jeśli stos jest pusty.
   */
  public int countOut() {
    if (callCheck()) return IF_EMPTY;
    return NUMBERS[total--];
  }
}
class HanoiRhymer extends defaultCountingOutRhymer {

  private static final int ZERO = 0;
  int totalRejected = ZERO;
  //TODO: reportRejected should be private, add validation in CountIn to ensure only positive integers are processed
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
