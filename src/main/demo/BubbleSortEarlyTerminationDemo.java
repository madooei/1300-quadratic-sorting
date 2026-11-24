package demo;

import java.util.Arrays;
import sorts.BubbleSortEarlyTermination;

/** A demo of BubbleSortEarlyTermination on the early-exit example from the notes. */
public final class BubbleSortEarlyTerminationDemo {

  private BubbleSortEarlyTerminationDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 1, 2, 3, 4};
    System.out.println("before: " + Arrays.toString(arr));

    // The second pass swaps nothing, so the sort stops after two passes.
    // Expect [1, 2, 3, 4, 5].
    BubbleSortEarlyTermination.bubbleSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
