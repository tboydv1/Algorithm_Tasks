package com.algo.ch7;

import java.math.BigInteger;
import java.util.Arrays;

public class Fibonacci {


    public static BigInteger fibonacci(int n){

        BigInteger[] fibSeries = new BigInteger[n];

        if(n > 2) {
            Arrays.fill(fibSeries, BigInteger.ZERO);
            fibSeries[1] = BigInteger.ONE;

            for (int x = 2; x < n; x++) {
                fibSeries[x] = fibSeries[x - 1].add(fibSeries[x - 2]);
            }
        }
        else{
            System.out.println("Value for n is not valid");
        }

        return fibSeries[n - 1];
    }
}
