/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static java.util.function.Predicate.not;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testRoll() {
//        check array if any numbers less than one or greater than 6
        int num = 5;
        int[] newArr = Library.roll(num);
        assertEquals(newArr.length, num);
    }

    @Test public void testContainsDuplicatesTrue(){
        int[] testArr = {1, 1, 2, 3, 4};
        assertTrue(Library.containsDuplicates(testArr));
    }

//    @Test public void testContainsDuplicatesFalse(){
//        int[] testArr = {1, 2, 3, 4};
//        assertTrue(Library.containsDuplicates(testArr));
//    }

    @Test public void testContainsDuplicatesFalse(){
        int[] testArr = {0, 1, 2, 3, 4};
        assertFalse("the array should not contain any duplicates", Library.containsDuplicates(testArr));
    }

//    Calculating Averages
//    Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.
    @Test public void testCalculateAveragesHappy(){
        int[] testArr = {0, 1, 2, 3, 4};
        int result = 2;
        assertEquals(result, Library.calculateAverages(testArr));
    }

    @Test public void testCalculateAveragesSad(){
        int[] testArr = {0, 1, 2, 3, 4};
        int result = 3;
        assertNotEquals(result, Library.calculateAverages(testArr));
    }

    @Test public void testArrayOfArraysLowestAverageHappy() {
        int[][] testArrs = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
        };

        int[] correctResponse = {55, 54, 60, 53, 59, 57, 61};

        assertArrayEquals(correctResponse, Library.arrayOfArraysLowestAverage(testArrs));
    }

    @Test public void testArrayOfArraysLowestAverageSad() {
        int[][] testArrs = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
        };

        int[] incorrectResponse = {65, 56, 55, 52, 55, 62, 57};
        assertFalse(Arrays.equals(incorrectResponse, Library.arrayOfArraysLowestAverage(testArrs)));
    }


}
