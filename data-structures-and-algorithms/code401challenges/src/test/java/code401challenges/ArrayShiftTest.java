package code401challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayShiftTest {

  @Test
  public void testArrayShiftEvenHappy() {
    int[] testArrToBeShifted = {1, 2, 3, 4};
    int newNum = 5;

    int[] expectedOutput = {1, 2, 5, 3, 4};
    assertArrayEquals(expectedOutput, ArrayShift.arrayShift(testArrToBeShifted, newNum));
  }

  @Test
  public void testArrayShiftOddHappy() {
    int[] testArrToBeShifted = {1, 2, 3, 4, 5};
    int newNum = 6;

    int[] expectedOutput = {1, 2, 3, 6, 4, 5};
    assertArrayEquals(expectedOutput, ArrayShift.arrayShift(testArrToBeShifted, newNum));
  }

  @Test
  public void testArrayShiftEvenSad() {
    int[] testArrToBeShifted = {1, 2, 3, 4};
    int newNum = 5;

    int[] expectedOutput = {1, 2, 3, 4};
    assertFalse(Arrays.equals(expectedOutput, ArrayShift.arrayShift(testArrToBeShifted, newNum)));
  }

  @Test
  public void testArrayShiftOddSad() {
    int[] testArrToBeShifted = {1, 2, 3, 4, 5};
    int newNum = 6;

    int[] expectedOutput = {1, 2, 3, 4, 5};
    assertFalse(Arrays.equals(expectedOutput, ArrayShift.arrayShift(testArrToBeShifted, newNum)));
  }
}