package sorts;

/** Selection sort. */
public final class SelectionSort {

  private SelectionSort() {
    // This class should not be instantiated!
  }

  // Sorts arr in ascending order, in place. Assumes arr is not null.
  public static void selectionSort(int[] arr) {
    for (int end = arr.length - 1; end > 0; end--) {
      int maxIndex = 0;
      for (int j = 1; j <= end; j++) {
        if (arr[j] > arr[maxIndex]) {
          maxIndex = j;  // found a larger element
        }
      }
      // swap the largest remaining element into position end
      int temp = arr[end];
      arr[end] = arr[maxIndex];
      arr[maxIndex] = temp;
    }
  }
}
