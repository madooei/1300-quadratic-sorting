package sorts;

/** Runs the bubble sort scenarios against the plain version. */
public class BubbleSortPlainTest extends BubbleSortTest {

  @Override
  protected void sort(int[] arr) {
    BubbleSort.bubbleSort(arr);
  }
}
