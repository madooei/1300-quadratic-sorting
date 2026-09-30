package sorts;

/** Insertion sort, in its swap-based and shift-based versions. */
public final class InsertionSort {

  private InsertionSort() {
    // This class should not be instantiated!
  }

  // The swap-based version. Sorts arr in ascending order, in place.
  // Assumes arr is not null.
  public static void insertionSortSwap(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
      }
    }
  }

  // The shift-based version. Sorts arr in ascending order, in place.
  // Assumes arr is not null.
  public static void insertionSortShift(int[] arr) {
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
