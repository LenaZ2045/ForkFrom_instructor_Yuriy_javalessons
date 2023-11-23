package com.proftelran.org.lessonseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreamTerminal {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("10", "20", "10", "30", "50");

        List<String> collect = stringList.stream()
                .filter(s -> "10".equals(s)).collect(Collectors.toList());
        System.out.println(collect);

        // findFirst - get first element (return Optional)
        String result = stringList.stream()
                .filter(s -> "80".equals(s)).findFirst().orElse("100");
        System.out.println(result);

        //collect
        Set<String> resultCollect = stringList.stream().collect(Collectors.toSet());

        //anyMatch
        boolean resultMatch = stringList.stream().anyMatch(x -> x.equals("50"));
        System.out.println(resultMatch);

        //allMatch
        System.out.println("all match result :" + stringList.stream()
                .allMatch(x -> x.equals("10")));
        //min, max
        System.out.println("min result for string :" +
                stringList.stream().min((o1, o2) -> o1.compareTo(o2)).get());
        //foreach

        //toArray
        String[] strings = stringList.stream().toArray(String[]::new);

        //reduce
        Optional<String> reduce = stringList.stream().reduce((s1, s2) -> s1 + "-" + s2);
        System.out.println(reduce.get());

        List<Integer> integerList = Arrays.asList(2, 3, 4, 5);

        Optional<Integer> integerOptional = integerList.stream().reduce((a, b) -> a + b);
        System.out.println(integerOptional.get());
    }
}
