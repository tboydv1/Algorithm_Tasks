package com.algo.algoexpert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassPhotos {

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.

        //sort arrays
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        //find row positions

        List<Integer> backRow;

        List<Integer> FrontRow;

        int rowSize = redShirtHeights.size() -1 ;

        System.out.println(redShirtHeights.get(rowSize) + " " + blueShirtHeights.get(rowSize));


        if(redShirtHeights.get(rowSize) > blueShirtHeights.get(rowSize)
                && redShirtHeights.get(0) > blueShirtHeights.get(0)){
            backRow = redShirtHeights;
            FrontRow = blueShirtHeights;
        }
        else if (redShirtHeights.get(rowSize) < blueShirtHeights.get(rowSize)
                && redShirtHeights.get(0) < blueShirtHeights.get(0)) {
            backRow = blueShirtHeights;
            FrontRow = redShirtHeights;
        }
        else{

            return false;
        }
        //compare students at the same position
        for(int i = 0; i < blueShirtHeights.size(); i++){

            if(backRow.get(i) < FrontRow.get(i)){
                return false;
            }

        }

        //return result


        return true;
    }
}
