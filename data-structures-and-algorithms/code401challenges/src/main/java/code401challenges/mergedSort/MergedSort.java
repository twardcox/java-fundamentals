package code401challenges.mergedSort;

import java.util.Arrays;

public class MergedSort {

  public static int[] mergeSort(int[] arr){
    int n = arr.length;

    if (n > 1){
      int mid = n / 2;
      int [] left = Arrays.copyOfRange(arr, 0, mid);
      int [] right = Arrays.copyOfRange(arr, mid, n);

      mergeSort(left);

      mergeSort(right);
      merge(arr, left, right);
    }

    return arr;
  }

  private static void merge(int[] arr, int[] left, int[] right){

    int i = 0; // left
    int j = 0; // right
    int k = 0; // arr

    while (i < left.length && j < right.length){

      if (left[i] <= right[j]){
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    if (i == left.length){
      while (k < arr.length){
        arr[k] = right[j];
        k++;
        j++;
      }
    } else {
      while (k < arr.length){
        arr[k] = left[i];
        k++;
        j++;
      }
    }


  }
}
