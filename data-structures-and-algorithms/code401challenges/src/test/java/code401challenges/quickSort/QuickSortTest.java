package code401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {

  @Test
  public void testQuickSort_Even() {
    int [] newArr = new int[]{4, 2, 8, 1, 5, 0};

    assertEquals("testQuickSort_Even is equal", "[0, 1, 2, 4, 5, 8]", Arrays.toString(QuickSort.quickSort(newArr, 0, newArr.length - 1 )));
  }

  @Test
  public void testQuickSort_Negatives() {
    int [] newArr = new int[]{-4, -2, -8, -1, -5, -0};

    assertEquals("testQuickSort_Even is equal", "[-8, -5, -4, -2, -1, 0]", Arrays.toString(QuickSort.quickSort(newArr, 0, newArr.length - 1 )));
  }


}