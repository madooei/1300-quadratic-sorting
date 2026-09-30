package sorts;

/** Runs the insertion sort scenarios against the swap-based version. */
public class InsertionSortSwapTest extends InsertionSortTest {

  @Override
  protected void sort(int[] arr) {
    InsertionSort.insertionSortSwap(arr);
  }
}
