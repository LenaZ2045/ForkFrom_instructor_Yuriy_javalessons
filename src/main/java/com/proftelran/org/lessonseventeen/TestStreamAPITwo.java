package com.proftelran.org.lessonseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPITwo {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Oleg", "Maxim", "Ivan", "Petr");

        //Example
        //        Function<String, Student> studentFunction = new Function<String, Student>() {
        //            @Override
        //            public Student apply(String s) {
        //                return new Student(s);
        //            }
        //        };

        // (S,S, S, S ) -> (St, St, St, St)
        // (S, S, S ,S) - > (St, S, I, St) !!! incorrect

        List<Student> studentList = nameList.stream()
                .map(s -> new Student(s))
                .collect(Collectors.toList());
        System.out.println(studentList);
    }
}
