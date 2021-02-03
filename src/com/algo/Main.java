package com.algo;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
     ArrayRotation rotation = new ArrayRotation();

     int[] testArr = {-4};
     int[] result = rotation.rotateArray(testArr, 0);

     for(int x : result){
         System.out.print(x +",");
     }
    }

    public static int solution(int [] A){

        List<Integer> missingValues = new ArrayList<>();
//       sort the array
        Set<Integer> integerSet  = new TreeSet<>();

//      search for the integer for the first positive integer
        int i = 1, positiveIndex  = 0;

        for(int a : A){
            if(a > 0)
            integerSet.add(a);
        }
//        loop through each positive integer in the array in order
        //        for each positive integer that is missed
//        store the value in another array
//        when done pick the lowest positive value
        int count = 1;
        while(integerSet.iterator().hasNext()){


            if(!integerSet.contains(count)){
                return count;
            }
            count++;
        }
        System.out.print(count);

        return count;

    }

    private static List<Integer> decimalToBinary(int decimal){
        List<Integer> binary = new ArrayList<>();

        //divide the decimal by 2
        int rem = 0;
        while(decimal > 0){
            rem = decimal % 2;
            binary.add(0, rem);
            decimal = decimal/2;
        }

        return binary;

    }

    public static int findGaps(List<Integer> binary){
        int higestGaps = 0;

        List<Integer> gaps = new ArrayList<>();
        int counts = 0;
        //check binary gap
        for (Integer integer : binary) {
            if (counts == 1) {
                higestGaps++;
            }
            if (integer == 1) {
                counts++;
            }
            if (counts == 2) {
                gaps.add(higestGaps - 1);
                counts = 1;
                higestGaps = 0;
            }
        }

            return gaps.isEmpty() ? 0: Collections.max(gaps);

    }
}
