package com.algo.leetcode;

import java.util.Random;

/**
 * @author oluwatobi
 * @version 1.0
 * @date on 20/07/2021
 * inside the package - com.algo.leetcode
 */
public class ShuffleArray {

    int[] array;
    int[] original;

    Random random;


    public ShuffleArray(int[] nums) {
        this.array = nums;
        this.original = array.clone();
        random = new Random();

    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {

        return original.clone();

    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {

        for(int i = 0; i < this.array.length; i++){

            swap(i, random.nextInt(this.array.length - i) + i);
        }

        return this.array;

    }

    public void swap(int i, int j){
        int temp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = temp;
    }

}


