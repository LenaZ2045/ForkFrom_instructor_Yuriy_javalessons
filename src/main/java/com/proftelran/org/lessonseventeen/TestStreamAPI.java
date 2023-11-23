package com.proftelran.org.lessonseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreamAPI {

    public static void main(String[] args) {

        //Collection.stream().Intermediate().Intermediate()......Terminal();

        //Intermediate
        // 1. filter(Predicate) - filter by true
        // 2. sorted() - sort elements
        // 3. limit(n) - limit of elements
        // 4. skip(n) - skip elements
        // 5. distinct() - only unique
        // 6. peek(consumer) - make action for each element
        // 7. map(Function) - convert one element to other

        //Terminal
        // 1. count() - count of elements in stream
        // 2. collect() (Collectors.toList())
        // 3. foreach(consumer) - make action for each element

        List<Integer> integerList = Arrays.asList(3, 8, 5, 3, 1, 6, 7, 4);
        // integerList.stream()
        int count = 0;
        for (Integer value : integerList) {
            if (value % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count " + count);

        Predicate<Integer> predicate = integer -> integer % 2 != 0;

        //filter, count
        long result = integerList.stream().filter(integer -> integer % 2 != 0).count();

        //sorted, collect
        List<Integer> collect = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("Unsorted : " + integerList);
        System.out.println("Sorted : " + collect);

        //sorted & limit
        List<Integer> resLimit = integerList.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Sorted and limit " + resLimit);

        //sorted & skip
        List<Integer> resSkip = integerList.stream().sorted().skip(3).collect(Collectors.toList());
        System.out.println("Sorted and skip " + resSkip);

        //distinct
        List<Integer> distinct = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct collection  " + distinct);

        //foreach(Consumer)
        integerList.stream().forEach(integer -> System.out.println(" " + integer));

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(" " + integer);
            }
        };

        //peek(Consumer)
        List<Integer> evenSortedList = integerList.stream().filter(element -> element % 2 == 0)
                .peek(integer -> System.out.print(" " + integer))
                .sorted().collect(Collectors.toList());
    }

    private long getCountOddElements(List<Integer> list) {

        return list.stream()
                .filter(integer -> integer % 2 != 0)
                .count();
    }
}
