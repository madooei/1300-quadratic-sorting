package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for selection sort. */
public class SelectionSortTest {

  @Test
  public void emptyArrayStaysEmpty() {
    int[] arr = {};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {}, arr);
  }

  @Test
  public void singleElementStaysPut() {
    int[] arr = {1};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {1}, arr);
  }

  @Test
  public void twoElementsOutOfOrderGetSorted() {
    int[] arr = {2, 1};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {1, 2}, arr);
  }

  @Test
  public void alreadySortedArrayIsUnchanged() {
    int[] arr = {1, 2, 3};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {1, 2, 3}, arr);
  }

  @Test
  public void allDuplicatesAreUnchanged() {
    int[] arr = {4, 4, 4};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {4, 4, 4}, arr);
  }

  @Test
  public void reverseSortedArrayGetsSorted() {
    int[] arr = {3, 2, 1};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {1, 2, 3}, arr);
  }

  @Test
  public void unsortedArrayGetsSorted() {
    int[] arr = {5, 1, 4, 2};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {1, 2, 4, 5}, arr);
  }

  @Test
  public void duplicatesAmongOtherValuesGetSorted() {
    int[] arr = {3, 1, 3, 2};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {1, 2, 3, 3}, arr);
  }

  @Test
  public void negativesSortBeforePositives() {
    int[] arr = {-3, 1, -7, 4};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {-7, -3, 1, 4}, arr);
  }

  @Test
  public void longerUnsortedArrayGetsSorted() {
    int[] arr = {5, 6, 0, 2, 1, 9, 3};
    SelectionSort.selectionSort(arr);
    assertContents(new int[] {0, 1, 2, 3, 5, 6, 9}, arr);
  }

  // Checks that actual holds the same values as expected, in the same order.
  private static void assertContents(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
