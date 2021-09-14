package com.algo.leetcode;

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

        int rev = 0, rem = 0;
        int l = String.valueOf(x).length();
        int c = 0;

        while(c < l){
            rem =  x % 10;
            System.out.println("rem --> "+rem);

            rev = rev * 10 + rem ;
            System.out.println("rev --> "+rev);

            x = x / 10;
            c++;
        }

        try {
            System.out.println("Before Math --> "+rev);
            rev = Math.toIntExact(rev);
        }catch (ArithmeticException e){
            return 0;
        }


        return rev;

    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
