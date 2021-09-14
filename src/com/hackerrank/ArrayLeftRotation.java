package com.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayLeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here

        List<Integer> result = new ArrayList<>();
       for(int i = 0; i < a.size(); i++){
          result.add(i, 0);
       }

        for(int i = 0; i < a.size() ; i++){
            System.out.println(i-d + " " + i + " " + a.size() + " " +a.get(i));
//
//            if((i-d) < 0){
//                result[((i-d)+a.size())]  =  a.get(i);
//            }
//            else{
//                result[i-d] =  a.get(i);
//            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        List<Integer> results = new ArrayList<>();

        for(int i =0; i <= n + 1; i++){
            results.add(0);
        }

        int max = 0;

        for(int i = 0; i < queries.size(); i++){

                int a = queries.get(i).get(0) - 1;
                int b = queries.get(i).get(1);

                results.set(a, results.get(a) + queries.get(i).get(2));

            System.out.println(b + 1 + " ==> "+results.get(b) +" "+" "+queries.get(i).get(2));
                results.set(b, (results.get(b) - queries.get(i).get(2)));

            results.forEach(integer -> {
                System.out.print(integer + " ");
            });
            System.out.println();
        }
        max = max(sum(results));

        results.forEach(integer -> {
            System.out.print(integer + " ");
        });

        return max;

    }

    public static List<Integer> sum(List<Integer> l){
        List<Integer> sumlist = new ArrayList<>();

        for(int i = 0; i < l.size(); i++){
            if(i == 0) {
                sumlist.add(l.get(i));
            }
            else{
                sumlist.add(l.get(i-1) + l.get(i));
            }
        }

        sumlist.forEach(integer -> {
            System.out.print(integer + " ");
        });
        return sumlist;
    }


    public static int max(List<Integer> l){
        int max = l.get(0);


        for(int i=0; i < l.size(); i++){
            if(l.get(i) > max){
                max=l.get(i);
            }
        }
        return max;
    }


}
