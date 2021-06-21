package com.algo;

import java.util.Arrays;

public class StringPractice {


    public static void main(String[] args) {

        char[] charArray = {'j', 'a', 'p', 'p', 'p','y', ' ', 'b', 'i', 'r', 't', 'h', 'd', 'a', 'y'};

        String[] stringArray = {"John", "a"};
        System.out.println(charArray[4]);
//        String b = new String(stringArray, 1, 1);

        int[][] x = new int[2][];

        x[0] = new int [2];
        x[1] = new int [3];

//        System.out.println(a.charAt(5));

        String a = "John";

        char[] result = new char[5];
        a.getChars(0, 4, result,3);

        System.out.println(Arrays.toString(result));


    }
}
