package demo;

import java.util.Arrays;
import sorts.InsertionSortShift;

/** A demo of InsertionSortShift on the array the notes trace. */
public final class InsertionSortShiftDemo {

  private InsertionSortShiftDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 6, 0, 2, 1, 9, 3};
    System.out.println("before: " + Arrays.toString(arr));

    // Each key shifts the larger elements right and is written once.
    // Expect [0, 1, 2, 3, 5, 6, 9].
    InsertionSortShift.insertionSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
