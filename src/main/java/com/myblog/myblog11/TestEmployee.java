package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
//        List<Employee> employees= Arrays.asList(
//
//                new Employee("mike",30,"chennai"),
//                new Employee("stallin", 25,"chennai"),
//                new Employee("sam", 31,"pune"),
//                new Employee("adam",34,"bengaluru")
//        );
//      //  List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//        List<Employee> emps = employees.stream().filter(emp -> emp.getName().startsWith("s")).collect(Collectors.toList());
//        for (Employee e : emps){
//            System.out.println(e.getName());
//            System.out.println(e.getAge());
//            System.out.println(e.getCity());
//        }

//        List<Integer> numbers = Arrays.asList(10,12,6,1,5,7,9,8);
//        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
//        System.out.println(data);

        //GrouBy


        List<Employee> employees= Arrays.asList(

                new Employee("mike",30,"chennai"),
                new Employee("stallin", 25,"chennai"),
                new Employee("sam", 31,"pune"),
                new Employee("adam",34,"bengaluru")
        );
        Map<String, List<Employee>> collect= employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
       // System.out.println(data);
        for (Map.Entry<String,List<Employee>> entry:collect.entrySet()){
            String city = entry.getKey();
            List<Employee> emplAge = entry.getValue();
           System.out.println("city"+city+"-----");
            for(Employee e :emplAge){
                System.out.println(e.getName());
                System.out.println(e.getAge());

            }
        }

    }
}
