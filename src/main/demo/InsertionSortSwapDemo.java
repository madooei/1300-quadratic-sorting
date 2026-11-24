package demo;

import java.util.Arrays;
import sorts.InsertionSortSwap;

/** A demo of InsertionSortSwap on the array the notes trace. */
public final class InsertionSortSwapDemo {

  private InsertionSortSwapDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 6, 0, 2, 1, 9, 3};
    System.out.println("before: " + Arrays.toString(arr));

    // Each key swaps left until it is in position.
    // Expect [0, 1, 2, 3, 5, 6, 9].
    InsertionSortSwap.insertionSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
