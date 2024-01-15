package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testClss2 {
    public static void main(String[] args) {
//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);

//        Function<Integer,Integer> result = i->i+10;
//        Integer val = result.apply(30);
//        System.out.println(val);

//        List<Integer> data = Arrays.asList(10,20,30,60,90);
//
//        List<Integer> newNumber = data.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNumber);

//        List<String> data = Arrays.asList("mike","stallin","adam","salam");
//
//        List<String> newNum = data.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newNum);


      //  List<String> data = Arrays.asList("mike","stallin","adam","salam");
//        List<Integer> data = Arrays.asList(1,19,2,60,4,8,3,50,6);
//
//        List<Integer> newNum = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newNum);

        List<Integer> data = Arrays.asList(1,19,2,60,4,8,3,50,6,1,2,8,2);

        List<Integer> newNum = data.stream().distinct().collect(Collectors.toList());
        System.out.println(newNum);




    }
}
