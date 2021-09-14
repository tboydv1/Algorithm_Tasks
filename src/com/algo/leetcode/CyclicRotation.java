package com.algo.leetcode;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[][] grid = {{40,10},{30,20}};
        int[][] outputGrid = new int[grid.length][];
        int k = 1;

        for(int i = 0; i < grid.length; i++){
            int n = grid[i].length;
            outputGrid[i] = new int[n];

            for (int j = 0; j < grid[i].length; j++){

                int x = grid[i][j];
                System.out.println(x + " n ->"+n);
                if((j - k) < 0){
                    System.out.println("j - k "+(j-k)+"\n"+"n+j-k -> "+(n+j-k ));
                    outputGrid[i][n + j - k] = x;
                }else{
                    outputGrid[i][j - k] = x;
                }
            }
        }

        System.out.println(Arrays.toString(outputGrid[0]));
    }
}
