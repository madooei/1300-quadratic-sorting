package sorts;

/** Runs the insertion sort scenarios against the shift-based version. */
public class InsertionSortShiftTest extends InsertionSortTest {

  @Override
  protected void sort(int[] arr) {
    InsertionSort.insertionSortShift(arr);
  }
}
