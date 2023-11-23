package com.proftelran.org.lessonsixteen;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FITest {

    public static void main(String[] args) {

        //convert string to upper case

        String strOne = "String";
        Consumer<String> toUpper = str -> System.out.println(str.toUpperCase());

        toUpper.accept(strOne);
        System.out.println(strOne);

        Function<String, String> stringFunction = s -> s.toUpperCase();
        String strNew = stringFunction.apply(strOne);
        System.out.println(strNew);

        Supplier<String> stringSupplier = () -> strOne.toUpperCase();
        String s = stringSupplier.get();
        System.out.println(s);

        Person alex = new Person("alex");
        System.out.println(alex);

        Consumer<Person> personConsumer = person -> person.setName(person.getName().toUpperCase());

        personConsumer.accept(alex);

        System.out.println(alex);

        Consumer<Person> personConsumerOne = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                String name = person.getName();
                person.setName(name.toUpperCase());
            }
        };

    }

}
