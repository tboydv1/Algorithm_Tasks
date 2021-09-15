package com.algo.leetcode;

import java.time.chrono.MinguoChronology;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

public class ReverseInteger {

    /**
     * Given an int
     * Divide by 10 to break each digit
     * multiply by to rever
     * @param x
     * @return
     */
    public static int reverse(int x) {

        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

        long reverseX = 0;
        int signOfX = x / Math.abs(x);
        int absOfX = Math.abs(x);

        while(absOfX > 0) {

            int digit =  absOfX % 10;

            System.out.println(digit);

            reverseX = reverseX * 10 + digit ;

            if (!((reverseX >= MIN) && (reverseX <= MAX)))
                return 0;

            absOfX = absOfX / 10;

            System.out.println(absOfX);


        }

        reverseX = reverseX * signOfX;

        System.out.println("result --> {}"+reverseX);
        return (int)reverseX;

    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));

    }
}
