package com.algo;


/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */
public class MountainArray {

    public static boolean validMountainArray(int[] arr) {

        int c = 0;

        if(arr.length < 3){
            return false;
        }

        for(int i = 0; i < arr.length - 1; i++){

            System.out.println(i);

            if(arr[(i + 1)] > arr[(i)]){
                System.out.println("Asc");
                if(c == 0){
                    c += 1;
                }
                if(c > 1){
                    return false;
                }else{
                    continue;
                }
            }
            else if(arr[(i)] > arr[(i + 1)]){
                System.out.println("Desc");
                if(c == 1){
                    c +=1;
                }
                else if (c == 0){
                    return false;
                }

                if(i == arr.length - 1)
                    return true;
            }
            else if(arr[(i)] == arr[(i + 1)]){
                return false;
            }

        }

        return c == 0 || c == 1 ? false : true;
    }

    public static void main(String[] args) {

//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr));
    }
}
