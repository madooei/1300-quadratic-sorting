package sorts;

/** Insertion sort, the shift-based version. */
public final class InsertionSortShift {

  private InsertionSortShift() {
    // This class should not be instantiated!
  }

  // The shift-based version. Sorts arr in ascending order, in place.
  // Assumes arr is not null.
  public static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int key = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1] > key) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = key;
    }
  }
}
