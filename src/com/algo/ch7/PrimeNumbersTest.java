package com.algo.ch7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers;
    @BeforeEach
    void setUp() {

        primeNumbers = new PrimeNumbers();
    }

    @Test
    void findPrimeIndicesTest() {
        boolean[] numbers = new boolean[10];
        assertFalse(numbers[2]);
        //set the boolean array to true
        Arrays.fill(numbers, true);
        assertTrue(numbers[2]);
        //for every index where value is true eliminate multiples(start with 2)
       primeNumbers.findPrimeIndices(numbers);
       assertFalse(numbers[4]);

       for(int i = 0; i < numbers.length; i ++){
           System.out.println(numbers[i] ? i : "Not prime");
       }

    }


}