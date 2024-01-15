package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestClass3 {
    public static void main(String[] args) {
//     Consumer<Integer> result= number-> System.out.println(number);
//     result.accept(100);

//        List<String> names = Arrays.asList("mike","adam","sam");
//        Consumer<String> val = name-> System.out.println(name);
//        names.forEach(val);

      //  System.out.println(new Random().nextInt(1000));

        Supplier<Integer> x =()->new Random().nextInt(1000);
        Integer y =  x.get();
        System.out.println(y);




    }
}
