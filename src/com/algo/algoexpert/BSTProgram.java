package com.algo.algoexpert;

import java.util.*;

import static java.lang.Math.abs;

public class BSTProgram {

    public static int findClosestValueInBST(BST tree, int target) {

        return findClosestValueHelper(tree, target, tree.value);

    }

    public static int findClosestValueHelper(BST tree, int target, int closest) {

        if (tree == null) {
            return closest;
        }

        if (abs(tree.value - target) < abs(tree.value - closest)) {
            closest = tree.value;
        }

        if (tree.value < target && tree.right != null) {
            return findClosestValueHelper(tree.right, target, closest);
        } else if (tree.value > target && tree.left != null) {
           return  findClosestValueHelper(tree.left, target, closest);
        } else {
            return closest;
        }

    }



    static class BST{
        public int value;
        public BST right;
        public BST left;

        BST(int value){
            this.value = value;
        }

    }

}
