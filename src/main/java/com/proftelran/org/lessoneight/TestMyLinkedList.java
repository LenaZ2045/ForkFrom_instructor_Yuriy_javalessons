package com.proftelran.org.lessoneight;

import java.util.LinkedList;
import java.util.List;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        packOperationsTwo(list);
        packOperationsOne(list);

        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(10);
        integerList.addFirst(15);
        integerList.addLast(20);
    }

    private static void packOperationsTwo(MyLinkedList list) {
        list.pushToTail(10);
    }

    private static void packOperationsOne(MyLinkedList list) {
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);

        ///8->3->4->2
        list.print();
        list.pushToTail(15);
        list.print();
    }
}
