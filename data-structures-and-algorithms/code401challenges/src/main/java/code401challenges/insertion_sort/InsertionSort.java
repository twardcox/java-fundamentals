package code401challenges.insertion_sort;


import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    int[] newArr = new int[]{8, 3, 6, 1, 4};

    int[] insertionSort = insertionSort(newArr);
  }

  public static int[] insertionSort(int[] arr){

    for (int i = 1; i < arr.length; i++){

      int j = i - 1;
      int temp = arr[i];

      while (j >= 0 && temp < arr[j] ){
        arr[j+1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }

    return arr;
  }

  public static int[] mergeSort(int[] arr){
    int n = arr.length;
    System.out.println("or over here.");
    if (n > 1){
      int mid = n / 2;
      int [] left = Arrays.copyOfRange(arr, 0, mid);
      int [] right = Arrays.copyOfRange(arr, mid, n);

      mergeSort(left);
      System.out.println("and over here.");
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
