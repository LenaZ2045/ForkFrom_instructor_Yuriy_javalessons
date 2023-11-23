package com.proftelran.org.lessonsixteen;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class TestSupplier {

    public static void main(String[] args) {

        Random random = new Random();

        IntSupplier intSupplier = () -> random.nextInt();
        System.out.println(intSupplier.getAsInt());
        DoubleSupplier doubleSupplier = () -> random.nextDouble();
        System.out.println(doubleSupplier.getAsDouble());
        LongSupplier longSupplier = () -> random.nextLong();
        System.out.println(longSupplier.getAsLong());
        BooleanSupplier booleanSupplier = () -> random.nextBoolean();
        System.out.println(booleanSupplier.getAsBoolean());

    }
}
