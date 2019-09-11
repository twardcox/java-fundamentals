package code401challenges.mergedSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergedSortTest {

  @Test
  public void testMergeSort_Even() {

    int[] newArr = new int[]{1, 4, 2, 3, 6, 3, 8, 0};

    assertEquals("testMergeSort_Even is equal", "[0, 1, 2, 3, 3, 4, 6, 8]",
                 Arrays.toString(MergedSort.mergeSort(newArr))
                );

  }

  @Test
  public void testMergeSort_Odd() {

    int[] newArr = new int[]{1, 4, 2, 3, 6, 8, 0};

    assertEquals("testMergeSort_Odd is equal", "[0, 1, 2, 3, 4, 6, 8]",
                 Arrays.toString(MergedSort.mergeSort(newArr))
                );

  }

  @Test
  public void testMergeSort_Empty() {

    int[] newArr = new int[]{};

    assertEquals("testMergeSort_Empty is equal", "[]",
                 Arrays.toString(MergedSort.mergeSort(newArr))
                );

  }

}