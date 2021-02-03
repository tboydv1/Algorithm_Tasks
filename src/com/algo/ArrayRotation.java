package com.algo;

import java.util.Arrays;

public class ArrayRotation {



    public int[] rotateArray(int[] array, int K){

        int[] result = new int[array.length];

        int loopCount =0;

        if(array.length == 1 || K == 0){
            return array;
        }

        while(loopCount < K) {

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
            for(int x : result){
                System.out.print(x +",");
            }
            System.out.println();
            array = Arrays.copyOf(result, result.length);

            loopCount++;
        }

        return result;
    }
}
