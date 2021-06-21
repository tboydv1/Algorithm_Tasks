package com.algo.toptal;

import java.util.*;

public class DialerSearch {


    public static String solution(String[] A, String[] B, String P) {
        // write your code in Java SE 8


        List<String> matches = new ArrayList<>();
        for(int i = 0; i < B.length; i++){

            if(B[i].contains(P)){
                matches.add(A[i]);
            }
        }


        if(matches.size() == 0){
            return "NO CONTACT";
        }
        else{
            matches.sort(Comparator.comparing(String::toString));

            return matches.get(0);
        }



    }

    public static void main(String[] args) {
        String[] A = {"pim", "pom"};
        String[] B = {"999999999", "777888999"};

        String result = solution(A, B, "88999");

        System.out.println(result);

    }


}
