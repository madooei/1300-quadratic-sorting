package demo;

import java.util.Arrays;
import sorts.SelectionSort;

/** A demo of SelectionSort on the reverse-sorted array from the notes. */
public final class SelectionSortDemo {

  private SelectionSortDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    System.out.println("before: " + Arrays.toString(arr));

    // Two passes swap 5 with 1 and 4 with 2.
    // Expect [1, 2, 3, 4, 5].
    SelectionSort.selectionSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
