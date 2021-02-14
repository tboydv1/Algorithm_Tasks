package com.algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {


    private static int[] solution(int[] arr, int times){
        //check if arr contains 1 element
        if(arr.length == 1){
            return arr;
        }

        for (int x : arr) {
            System.out.print(x + ",");
        }
        System.out.println();

        int rot = 0;

        int[] result = new int[arr.length];

        while(rot < times){

            for(int i = 0; i < arr.length - 1; i++){

                if(i == 0){
                    result[arr.length - 1] = arr[i];
                }

                result[i] = arr[i + 1];

            }

            for (int x : result) {
                System.out.print(x + ",");
            }
            System.out.println();
            arr = Arrays.copyOf(result, result.length);

            rot++;

        }

        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        solution(arr, 4);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int a_i=0; a_i < n; a_i++){

            a[a_i] = in.nextInt();
            System.out.printf("%d%n", a[a_i]);

        }

        for (int x : a) {
            System.out.print(x + ",");
        }
        System.out.println("\n");

        for(int i=0; i<n; i++){

            if((i-k)<0) {
                System.out.printf("if statement --> {n+i-k} --> %d {i}--> %d%n", n+i-k, i);
                b[n + i - k] = a[i];
            }
            else {
                System.out.printf("Else statement --> {i-k} --> %d {i}--> %d%n", i-k, i);
                b[i - k] = a[i];
            }


            for (int x : b) {
                System.out.print(x + ",");
            }
            System.out.println("\n");
        }

        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
