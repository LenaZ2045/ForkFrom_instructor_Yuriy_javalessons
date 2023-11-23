package com.proftelran.org.lessonfifteen;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        Function<Integer, Double> half = new Function<Integer, Double>() {

            @Override
            public Double apply(Integer integer) {
                return integer / 2.0;
            }
        };

        Function<Integer, Double> halfByLambda = integer -> integer / 2.0;

        Double result = half.apply(5);
        System.out.println(result);

        System.out.println(halfByLambda.apply(7));
    }
}
