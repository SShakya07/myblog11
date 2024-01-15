package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {


//        Predicate<Integer> val = x->x%2==0;
//        boolean result = val.test(10);
//        System.out.println(result);

//        Predicate<String> val = str->str.equals("mike");
//        boolean result = val.test("stallin");
//        System.out.println(result);

//        List<Integer> numbers=  Arrays.asList(10,20,15,45,46,1);
//        List<Integer> evenNum = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        List<Integer> oddNum = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(evenNum);
//        System.out.println(oddNum);

        List<String> numbers=  Arrays.asList("mike","adam","mike","stallin","mohan");
        List<String> data = numbers.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
        List<String> data2 = numbers.stream().filter(s -> s.startsWith("mike")).collect(Collectors.toList());
        List<String> data3 = numbers.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
    }
}
