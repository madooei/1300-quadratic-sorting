package sorts;

/** Runs the bubble sort scenarios against the early-termination version. */
public class BubbleSortEarlyTerminationTest extends BubbleSortTest {

  @Override
  protected void sort(int[] arr) {
    BubbleSort.bubbleSortWithEarlyTermination(arr);
  }
}
