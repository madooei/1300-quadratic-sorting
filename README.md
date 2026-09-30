# Quadratic Sorting

Selection sort, bubble sort in its plain and early-termination versions, and insertion sort in its swap-based and shift-based versions. Each version has its own JUnit test class, so you can check one version at a time.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      sorts/
        SelectionSort.java                    # swaps the largest remaining element to the end
        BubbleSort.java                       # plain and early-termination versions
        InsertionSort.java                    # swap-based and shift-based versions
    test/
      sorts/
        SelectionSortTest.java                # the selection sort scenarios
        BubbleSortTest.java                   # the bubble sort scenarios
        BubbleSortPlainTest.java
        BubbleSortEarlyTerminationTest.java
        InsertionSortTest.java                # the insertion sort scenarios
        InsertionSortSwapTest.java
        InsertionSortShiftTest.java
  scripts/
    test.sh                                   # compile and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh sorts.InsertionSortShiftTest` — compiles everything and runs only that test class. Use this while you are working on one version and the others are still empty.

## What's here

- `sorts.SelectionSort` — `selectionSort`, which selects the largest remaining element and swaps it into the end of the unsorted portion.
- `sorts.BubbleSort` — `bubbleSort`, the plain version, and `bubbleSortWithEarlyTermination`, which stops after a pass that makes no swaps.
- `sorts.InsertionSort` — `insertionSortSwap`, which swaps the key to the left until it is in position, and `insertionSortShift`, which shifts the larger elements to the right and writes the key once.
- `sorts.SelectionSortTest` — the tests for selection sort. There is only one version, so there is no abstract suite.
- `sorts.BubbleSortTest` and `sorts.InsertionSortTest` — the abstract scenario suites, one per algorithm.
- `sorts.BubbleSortPlainTest`, `sorts.BubbleSortEarlyTerminationTest`, `sorts.InsertionSortSwapTest`, `sorts.InsertionSortShiftTest` — each runs its algorithm's scenarios against one version.
