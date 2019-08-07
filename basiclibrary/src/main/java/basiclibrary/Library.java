/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;

public class Library {

    public static int[] roll(int n) {
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++){
            newArr[i] = (int)(Math.random() * 6) + 1;
        }
        return newArr;
    }

    public static boolean containsDuplicates(int[] arr){

        for (int i = 0 ; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (j != i && arr[j] == arr[i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int calculateAverages(int[] arr){
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }

    public static int[] arrayOfArraysLowestAverage(int[][] arrs){
        int lowAvg = 100000;
        int[] newArr = {};
        for (int[] arr : arrs){
            if(calculateAverages(arr) < lowAvg){
                lowAvg = calculateAverages(arr);
                newArr = arr;
            }
        }
        return newArr;
    }

}
