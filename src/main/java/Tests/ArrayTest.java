package Tests;/*
 * @created Sun / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {


        //Variables declarations
        int[] tenNumsArray = new int[10];
        int i, a, b, t;
        int min, max;
        Random numberGenerator = new Random();
        // Array auto int entries
        for (i = 0; i < tenNumsArray.length; ++i)
            tenNumsArray[i] = numberGenerator.nextInt(100);
        for (i = 0; i < tenNumsArray.length; ++i)
            System.out.println("This is tensNumsArray, index[" + i + "]: " + tenNumsArray[i]);

        //Initializing min and max for comparison
        min = max = tenNumsArray[0];

        // Assignment of min and max through comparison, using a for loop for the indexes
        for (int k = 1; k < tenNumsArray.length; k++) {
            if (tenNumsArray[k] < min) min = tenNumsArray[k];
            if (tenNumsArray[k] > max) max = tenNumsArray[k];
        }
        System.out.println();
        System.out.println("minimum number of the array is: " + min + "\nmaximum number of the array is: " + max+"\n");

        // Bubble Sorting the array from last to first
        for (a = 1; a < tenNumsArray.length; a++) {
            for (b = tenNumsArray.length - 1; b >= a; b--) {
                if (tenNumsArray[b - 1] > tenNumsArray[b]) { // comparing third to last vs second last index, if out of order exchange elements.
                    t = tenNumsArray[b - 1]; //
                    tenNumsArray[b - 1] = tenNumsArray[b];
                    tenNumsArray[b] = t;
                }
            }
        }
                    // display sorted array
                    System.out.print("Sorted array is:"+"\n");
                    for (int num : tenNumsArray) System.out.print(num+ "\t");

                    // Uncomment to see the complete iteration , remember to comment the braces above the out.print
//                }
//            }
//        }

    }
}