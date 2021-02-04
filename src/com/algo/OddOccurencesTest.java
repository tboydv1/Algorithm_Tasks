package com.algo;

import java.util.Arrays;

/**
 * pick a number
 * count occurencies
 * if occurence is an even number(meaning they are pairs)
 * move on to the next number
 * Repeat till you find odd occurence
 */

public class OddOccurencesTest {

    public static int solution(int[] A) {

        //sort the array
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));

        int currentValue = 0, occurence = 1, count = 0;
        while (true) {

            currentValue = A[count];
            System.out.println("cur val -->" + currentValue);


            for (int j = count + 1; j < A.length - 1; j++) {

                if (A[j] == currentValue) {
                    occurence++;
                }

                if(A[j] != currentValue){
                    break;
                }
            }

            System.out.println("occurs --> " + occurence);
            if (occurence % 2 == 1) {
                return currentValue;
            }

            System.out.println("count" +count);
            count += occurence;
            occurence = 1;

        }


    }

    public static void main(String... args){
        int[] arr = {2, 2, 3, 3, 4};

       int result =  solution(arr);
        System.out.println(result);

    }
}
