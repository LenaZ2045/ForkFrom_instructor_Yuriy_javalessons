package com.proftelran.org.lessonfifteen;

import java.util.*;

public class TestFuncInterface {

    public static void main(String[] args) {
        //   Multiplayer multiplayer = new MultiplayerImpl();
        //   multiplayer.multiplay(10);

        Multiplayer multiplayerTwo = new Multiplayer() {
            @Override
            public void multiplay(int value) {
                value *= 5;
                System.out.println("Result value * 5 = " + value);
            }
        };

        multiplayerTwo.multiplay(4);

        Multiplayer multiplayerThree = value -> System.out.println("Result value * 10 = " + value * 10);

        multiplayerThree.multiplay(6);

        Printer printer = () -> System.out.println("Hello");

        Printer printerOne = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };

        PrinterAddon printerAddon = (one, two) -> System.out.println(" " + one + " " + two);

        printerAddon.print("Hello", "World");


        // Comparator<Integer> sortByAge = (o1, o2) -> Integer.compare(o1, o2);

        Comparator<Book> sortByAge = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());

        List<Book> bookList = Arrays.asList(new Book(), new Book());

        Collections.sort(bookList, sortByAge);

    }
}
