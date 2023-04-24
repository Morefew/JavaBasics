/*
 * @created Sun / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */
/* REFERENCES:
Cutajar, J. (2018). Beginning Java Data Structures and Algorithms (1st ed.). PACKT Publishing Limited.
Schildt, H. (2022). Java: The Complete Reference (12th ed.). McGraw Hill.
Wengrow, J., &amp; MacDonald, B. (2020). A common-sense guide to data structures and algorithms:
Level up your core programming skills (2nd ed.). The Pragmatic Bookshelf.
 */
package myco.com.DataStructures;

import java.util.Arrays;


public class ArrayBidimensional {

    //Creating a method to merge indefinite number of arrays into a bidimensional array.
    private static int[][] mergeArrays(int[]... arrays) {
        int[][] mergedArray = new int[arrays.length][];
        int i = 0;
        for (int[] array: arrays) {
            mergedArray[i] = arrays[i];
            i++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {

        // Trying to merge 2 arrays in one
        int[] arrayA = {1, 3, 5, 7, 9};
        int[] arrayB = {2, 4, 6, 8, 10};
        int[] arrayC = {11, 14, 19, 26, 35};
        int[] arrayD = {5, 10, 13, 18, 25, 28};
        int[] arrayE = {4, 7, 8, 11, 26};
        int[] arrayF = {2, 3, 2};
        int[][] arrayG = new int[2][5];
        arrayG[0] = arrayA;
        arrayG[1] = arrayB;
        int[][] arrayH = mergeArrays(arrayA, arrayB, arrayC);
        int[][] arrayI={arrayA,arrayB,arrayC,arrayD,arrayF};


        System.out.println("Array G= "+Arrays.deepToString(arrayG));
        System.out.println("Array H= "+Arrays.deepToString(arrayH));
        System.out.println("Array I= "+Arrays.deepToString(arrayI));
        System.out.println();
        System.out.println("Direct Merging 2 Arrays "+Arrays.deepToString(mergeArrays(arrayA, arrayC)));
        System.out.println();
        System.out.println("Direct Merging 3 Arrays "+Arrays.deepToString(mergeArrays(arrayA, arrayC, arrayE)));
        System.out.println("Direct Merging 3 Different Arrays "+Arrays.deepToString(mergeArrays(arrayF, arrayE, arrayD)));

    }

}
