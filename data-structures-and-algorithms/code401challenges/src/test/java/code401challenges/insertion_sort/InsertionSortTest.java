package code401challenges.insertion_sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

  @Test
  public void testInsertionSort_Happy() {

    int[] newArr = new int[]{8, 3, 6, 1, 4};

    int[] insertionSort = InsertionSort.insertionSort(newArr);
    assertEquals("testInsertionSort_Happy", "[1, 3, 4, 6, 8]", Arrays.toString(insertionSort));
  }

  @Test
  public void testInsertionSort_Empty() {

    int[] newArr = new int[]{};

    int[] insertionSort = InsertionSort.insertionSort(newArr);

    assertEquals("testInsertionSort_Empty", "[]", Arrays.toString(insertionSort));
  }

  @Test
  public void testInsertionSort_AllSameNumber() {

    int[] newArr = new int[]{8, 8, 8, 8, 8};

    int[] insertionSort = InsertionSort.insertionSort(newArr);
//    System.out.println("*************" + Arrays.toString(insertionSort));
    assertEquals("testInsertionSort_AllSameNumber", "[8, 8, 8, 8, 8]", Arrays.toString(insertionSort));
  }

  @Test
  public void testInsertionSort_OneNumber() {

    int[] newArr = new int[]{8};

    int[] insertionSort = InsertionSort.insertionSort(newArr);
//    System.out.println("*************" + Arrays.toString(insertionSort));
    assertEquals("testInsertionSort_OneNumber", "[8]", Arrays.toString(insertionSort));
  }
}