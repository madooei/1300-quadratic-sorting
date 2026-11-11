package sorts;

/** Bubble sort, the early-termination version. */
public final class BubbleSortEarlyTermination {

  private BubbleSortEarlyTermination() {
    // This class should not be instantiated!
  }

  // The early-termination version: stops after a pass that makes no swaps.
  // Sorts arr in ascending order, in place. Assumes arr is not null.
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];  // swap the out-of-order pair
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;  // remember that this pass did work
        }
      }
      if (!swapped) {
        break;  // a clean pass means the array is already sorted
      }
    }
  }
}
