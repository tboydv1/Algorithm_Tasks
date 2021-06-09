package com.algo;


import java.util.Arrays;

public class ArrayRotation {


    public  static int[] rotateArray(int[] array, int K) {

        int[] result = new int[array.length];

        int loopCount = 0;

        if (array.length == 1 || K == 0) {
            return array;
        }

        for (int x : array) {
            System.out.print(x + ",");
        }
        System.out.println();

        while (loopCount < K) {

            int count = 0;

            for (int i = 0; i < array.length; i++) {

                if (i == 0) {
                    result[i] = array[array.length - 1];
                    continue;
                }

                if (count == array.length - 1) {
                    break;
                }
                result[i] = array[count];
                count++;
            }
            for (int x : result) {
                System.out.print(x + ",");
            }
            System.out.println();
            array = Arrays.copyOf(result, result.length);

            loopCount++;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        rotateArray(arr, 4);

        int rot = 4;
        int[] result = new int[arr.length];


        for(int j = 0; j < arr.length; j++){

            if(j + rot > arr.length - 1){

                result[j - arr.length + rot] = arr[j];
            }
            else{
                result[j + rot] = arr[j];
            }

            for (int x : result) {
                System.out.print(x + ",");
            }
            System.out.println();
        }

        for (int x : result) {
            System.out.print(x + ",");
        }
        System.out.println();


    }

}
