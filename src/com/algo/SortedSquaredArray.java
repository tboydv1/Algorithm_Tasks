package com.algo;

public class SortedSquaredArray {


    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] outputArr = new int[array.length];


        int smallest = 0;
        int largest = array.length - 1;

        for(int i = array.length -1; i >= 0; i--){
            int smVal = Math.abs(array[smallest]);
            int lgVal = Math.abs(array[largest]);

            if( smVal > lgVal ){
                outputArr[i] = smVal * smVal;
                smallest++;
            }
            else{
                outputArr[i] = lgVal * lgVal;
                largest--;
            }
        }
        //Declare an output array

        return outputArr;
    }

}
