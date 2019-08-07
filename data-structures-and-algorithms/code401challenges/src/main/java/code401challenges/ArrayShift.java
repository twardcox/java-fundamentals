package code401challenges;

public class ArrayShift {
  public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded){
    int[] newArr = new int[arrToBeShifted.length + 1];
    int insertIndexPosition = (int)Math.ceil(newArr.length / 2);

    for (int i = 0 ; i < newArr.length; i++){
      if (i < insertIndexPosition){
        newArr[i] = arrToBeShifted[i];
      } else if ( i == insertIndexPosition){
        newArr[i] = intToBeAdded;
      } else {
        newArr[i] = arrToBeShifted[i-1];
      }
    }
    return newArr;

  }
}
