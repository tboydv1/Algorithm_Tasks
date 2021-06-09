package com.algo.ch7;

public class PrimeNumbers {


    public boolean[] findPrimeIndices(boolean[] numbers){
        for(int i = 2; i < numbers.length; i++){
            if(numbers[i]){
                eliminateMultiples(numbers, i);
            }
        }

        return numbers;
    }

    private void eliminateMultiples(boolean[] numbers, int i){
        int multiple;
        for(int j = 2; j < numbers.length; j++){
            multiple = i * j;
            if(multiple < numbers.length){
                numbers[multiple] = false;
            }
            else break;
        }
    }



}
