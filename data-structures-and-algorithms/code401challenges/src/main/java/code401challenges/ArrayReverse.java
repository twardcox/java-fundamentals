package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(reverseArrayStretch(toBeReversed)));

  }

  public static int[] reverseArray(int[] arr) {
    if (arr.length == 0) {
      return arr;
    }
    int[] newArr = new int[arr.length];
    int j = arr.length;

    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[j - 1];
      j--;
    }

    return newArr;
  }

  public static int[] reverseArrayStretch(int[] arr) {
    if (arr.length == 0) {
      return arr;
    }
    int[] newArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[arr.length - i - 1];
    }

    return newArr;
  }
}