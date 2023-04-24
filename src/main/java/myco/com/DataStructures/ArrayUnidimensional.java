package myco.com.DataStructures;


import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;

public class ArrayUnidimensional {
    public static void main(String[] args) {


        //Variables declarations
        int[] tenNumsArray = new int[10];
        int[] secondNums = {89, 23, 41, 65, 29, 86, 69};
        int[] thirdNums = {9, 2, 1, 6, 7, 8, 5, 4, 3};
        int[] fourthNums = {59, 83, 87, 97, 71, 16, 54, 94, 3, 93, 70, 91, 55, 69, 96, 72, 58, 34, 57, 38, 98, 47, 24, 44, 10, 43, 17, 45, 99, 15, 4, 82, 6, 37, 13, 30, 40, 41, 74, 92, 2, 52, 12, 27, 51, 11, 95, 80, 21, 66};
        String[] stringsArr = {"Grape", "Blueberry", "Honeydew melon", "Elderberry", "Apricot", "Kiwi", "Date", "Cherry", "Lemon", "Fig"};
        int i, min, max;
        Random random = new Random();

        // Array auto int entry
        for (i = 0; i < tenNumsArray.length; ++i)
            tenNumsArray[i] = random.nextInt(100);
        System.out.println("This is tensNumsArray: " + Arrays.toString(tenNumsArray));
        System.out.println("This is secondNums: " + Arrays.toString(secondNums));
        System.out.println("This is thirdNums: " + Arrays.toString(thirdNums));
        System.out.println("This is FourthNums: " + Arrays.toString(fourthNums));
        System.out.println("This is StringArr: " + Arrays.toString(stringsArr));

        //Initializing min and max for comparison
        min = max = tenNumsArray[0];

        // Assignment of min and max through comparison, using a for loop for the indexes
        for (int k = 1; k < tenNumsArray.length; k++) {
            if (tenNumsArray[k] < min) min = tenNumsArray[k];
            if (tenNumsArray[k] > max) max = tenNumsArray[k];
        }
        System.out.println("\nMinimun and Maximun number of tensNumsArray: ");
        System.out.println("min: " + min + "\t" + "max: " + max + "\n");

        //Test of changes in the Array address after sorting - Address before
        System.out.println(MessageFormat.format("{0}, {1}, {2}, {3}, {4}", tenNumsArray, secondNums, thirdNums, fourthNums, stringsArr));

        // Sorting the arrays from last to first
        sortIntArray(tenNumsArray);
        Arrays.sort(secondNums);
        Arrays.sort(thirdNums, 0, 6);
        Arrays.parallelSort(fourthNums);
        Arrays.sort(stringsArr);

        //Test of changes in the Array address after sorting - Address After
        System.out.println(MessageFormat.format("{0}, {1}, {2}, {3}, {4}\n", tenNumsArray, secondNums, thirdNums, fourthNums, stringsArr));

        // displaying the arrays sorted
        System.out.print("Sorted arrays:" + "\n");
        System.out.println("TenNums");
        System.out.println(Arrays.toString(tenNumsArray) + "\n");
        System.out.println("SecondNums");
        System.out.println(Arrays.toString(secondNums) + "\n");
        System.out.println("ThirdNums");
        System.out.println(Arrays.toString(thirdNums) + "\n");
        System.out.println("FourthNums");
        System.out.println(Arrays.toString(fourthNums) + "\n");
        System.out.println("StringArr");
        System.out.println(Arrays.toString(stringsArr) + "\n");

        String[] cloneArr = stringsArr.clone();
        cloneArr[1] = "Bananas";
        System.out.println(Arrays.toString(cloneArr)+"\n");

        int[] cloneIntArr = thirdNums.clone();
        cloneIntArr[6] = 101;
        System.out.println(Arrays.toString(cloneIntArr)+"\n");

    }

    //Implementation of a Bubble Sort Algorithm
    public static int[] sortIntArray(int[] intsArray) {
        int t, b, a;
        for (a = 1; a < intsArray.length; a++) {
            for (b = intsArray.length - 1; b >= a; b--) {
                if (intsArray[b - 1] > intsArray[b]) { // comparing third to last vs second last index, if out of order exchange elements.
                    t = intsArray[b - 1]; //
                    intsArray[b - 1] = intsArray[b];
                    intsArray[b] = t;
                }
            }
        }
        return intsArray;
    }
}