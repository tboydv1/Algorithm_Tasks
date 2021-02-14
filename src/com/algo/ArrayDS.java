package com.algo;

import java.util.Arrays;

public class ArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int[] arrSums = new int[16];

        int x =0;

        for(int row = 0; row < arr.length - 2; row++){

            for(int col = 0; col < arr.length -2; col++){

                int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                        + arr[row + 1][col + 1]
                        + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];

                System.out.printf("Sums %d%n", sum);

                arrSums[x] = sum;
                x++;
            }
            System.out.printf("%n");
        }

        return Arrays.stream(arrSums).max().getAsInt();
    }

    public static void main(String[] args) {
        int [][] arr = { {1,1,1,0,0,0},

                {0,1,0,0,0,0},

                {1, 1,1, 0, 0, 0},

                {0, 0 ,2 ,4 ,4 ,0},

                {0 ,0 ,0 ,2 ,0 ,0}

                ,{0, 0 ,1 ,2 ,4 ,0}};

        int result = hourglassSum(arr);

        System.out.println("Result --> "+result);
    }



}
