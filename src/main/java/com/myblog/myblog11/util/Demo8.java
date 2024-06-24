package com.myblog.myblog11.util;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo8 {
    public static void main(String[] args) {
//        List<String> name =Arrays.asList("prem","satyam","lal","lal","satyam");
//
////        List<String> name1 =new ArrayList<>();
////        name1.add("prem");
//           Map<String,Long> name2 = name.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//            System.out.println(name2);

           List<Integer> list = Arrays.asList(1,6,2,7,3,8,9);
        List<Integer> collect =list.stream().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
        System.out.println(collect);

    }
}

