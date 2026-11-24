package demo;

import java.util.Arrays;
import sorts.BubbleSortPlain;

/** A demo of BubbleSortPlain on the array the notes trace. */
public final class BubbleSortPlainDemo {

  private BubbleSortPlainDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 1, 4, 2};
    System.out.println("before: " + Arrays.toString(arr));

    // Three passes, four swaps, one per inversion.
    // Expect [1, 2, 4, 5].
    BubbleSortPlain.bubbleSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
