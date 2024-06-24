package com.myblog.myblog11.util;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo9 {
    public static void main(String[] args) {
            String s ="infinite";

        Map<Character,Long> charmap = s.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

         charmap.forEach((character , frequency)-> System.out.println(character +" "+frequency));


////
//       List<Integer> numbers = Arrays.asList( 6,3,5,8,19,20);
//        if(numbers.size()<2){
//            System.out.println("not possible");
//            return;
//        }
//        int highest = Integer.MIN_VALUE;
//        int secondHighest = Integer.MIN_VALUE;
//
//        for(int number: numbers){
//            if(number> highest) {
//                secondHighest = highest;
//                highest = number;
//            }
//            else if(number> secondHighest){
//                secondHighest = number;
//            }
//        }
//
//        if(secondHighest==Integer.MIN_VALUE){
//            System.out.println("no element");
//        }else{
//            System.out.println("second highest "+secondHighest);
//        }
//



    }
}
