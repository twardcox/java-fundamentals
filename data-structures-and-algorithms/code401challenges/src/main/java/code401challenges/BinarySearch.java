package code401challenges;

public class BinarySearch{

  public static int binarySearch(int[] arr, int n){
//    https://dzone.com/articles/binary-searching-in-java-without-recursion
    int begin = 0;
    int last = arr.length - 1;
    int mid = 0;

    while (begin <= last) {
      mid = (begin + last) / 2;
      if (arr[mid] < n) {
        begin = mid + 1;
      } else if (arr[mid] > n) {
        last = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

}
