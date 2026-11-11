package sorts;

/** Bubble sort, the plain version. */
public final class BubbleSortPlain {

  private BubbleSortPlain() {
    // This class should not be instantiated!
  }

  // Sorts arr in ascending order, in place. Assumes arr is not null.
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];  // swap the out-of-order pair
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
