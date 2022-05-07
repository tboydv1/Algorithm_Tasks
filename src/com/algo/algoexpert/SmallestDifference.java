package com.algo.algoexpert;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args) {

        int [] arrData1  = {-1, 5, 10, 20, 28, 3};
        int [] arrData2  = {26, 134, 135, 15, 17};

        System.out.print("\nResult: ");
        displayArray(smallestDifference(arrData1, arrData2));

    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        //sort the array
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        displayArray(arrayOne);
        displayArray(arrayTwo);
        System.out.println();


        int x, y , diff;

        int lowest = Math.abs(arrayOne[0] - arrayTwo[0]);

        int [] result = new int[2];

        for(int i = 0; i < arrayOne.length; i++){

            x = arrayOne[i];

            for (int j = 0; j < arrayTwo.length; j++){

                y = arrayTwo[j];

                diff = (Math.abs(x - y));

                if(diff < lowest){
                    System.out.print("new lowest :: "+lowest+"\n");
                    result[0] = x;
                    result[1] = y;
                    lowest = diff;
                }
                if(diff == 0){
                    break;
                }

            }
        }

        return result;
    }

    private static void displayArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
