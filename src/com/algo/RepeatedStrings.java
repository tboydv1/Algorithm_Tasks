package com.algo;

public class RepeatedStrings {


    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        //check for occurrence of a's in s == substring
        long subCount = 0;
        for(int i = 0; i < s.length(); i++){

            if(Character.valueOf(s.charAt(i)).equals('a')){
                subCount++;
            }

            System.out.println(subCount);

        }


        subCount = (subCount * (n / s.length()));

        System.out.println("after division --> "+subCount);


        if(!(n % s.length() == 0)){
            System.out.printf("Remainder --> %d%n", n % s.length());
            for(int i = 0; i < n % s.length(); i++){
                if(Character.valueOf(s.charAt(i)).equals('a')){
                    subCount++;
                }

            }

            System.out.println("second loop --> "+subCount);
        }

        return subCount;
    }

    public static void main(String[] args) {

        long result = repeatedString("a", 1000000000000L);

        System.out.println(result);
    }

}
