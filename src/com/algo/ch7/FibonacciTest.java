package com.algo.ch7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void fibonacci() {

       BigInteger result =  Fibonacci.fibonacci(9);
       assertEquals(BigInteger.valueOf(21), result);


       for(int n = 2; n < 50; n++){
           result = Fibonacci.fibonacci(n);
           System.out.printf("%d ---> %d%n", n, result);
       }
    }
}