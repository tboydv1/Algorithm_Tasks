package com.algo.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Lamdas {


    public static void main(String[] args) {

        IntUnaryOperator unaryOperator = (x) -> x * 2;
        IntConsumer consumer = (System.out::print);

        Predicate<Integer> greaterThan2 = e -> e > 2;
        Predicate<Integer> LessThan4 = e -> e < 4;


        List<Integer> list = List.of(1, 2, 3, 4, 5,3, 6, 3,3);

        Optional<Integer> result = list.stream()
            .filter(greaterThan2.negate())
            .findFirst();

        if(!result.isEmpty()){
            System.out.println();
        }


//        IntStream stream = IntStream.range(1, 5);
//        stream = stream
//                .peek(i -> System.out.println("starting "+ i))
//                .filter(i -> { System.out.println("filtering "+ i);
//                                    return i % 2 == 0;})
//                .peek(i ->  System.out.println("post filtering "+ i));
//
//                System.out.println("Invoking terminal method count.");
//                System.out.println("The count is "+ stream.count());

//        List<Integer> stream1 = List.of(1, 2,3,4, 5);
//        stream1.forEach(System.out::print);
//        System.out.println();
//
//        List<Integer> stream2 = new ArrayList<>();
//        List<Integer> stream3 = new ArrayList<>();
//
//        int total = 0;
//
//        for (int i = 0; i < stream1.size(); i++){
//            int currentStreamElement = stream1.get(i);
//
//            //step1
//            if(currentStreamElement % 2 == 0){
//                stream2.add(currentStreamElement);
//            }
//
//            //step2
//            stream3.add(stream2.get(i) * 3);
//
//            //reduction
//            total+=stream3.get(i);
//        }
//
//        stream2.forEach(System.out::print);
    }




}
