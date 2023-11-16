package com.proftelran.org.lessonfifteen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        // Consumer - accept(variable)

        Consumer<Integer> multiplier = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Result integer * 2 = " + (integer * 2));
            }
        };

        Consumer<Integer> multiplierAsLambda = integer ->
                System.out.println("Result integer * 2 = " + (integer * 2));

        multiplier.accept(6);
        multiplierAsLambda.accept(5);

        // Multiply all values by 2
        List<Integer> integerList = Arrays.asList(2,3,4,5,6);
        Consumer<List<Integer>> modify = integerList1 -> {
               for (int i = 0; i < integerList1.size(); i++) {
                   integerList1.set(i, integerList1.get(i) * 2);
               }
        };

        modify.accept(integerList);
        System.out.println(integerList);
    }
}
