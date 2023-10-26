package com.proftelran.org.lessoneight.hwr;

import java.util.ArrayList;
import java.util.List;

public class HwExample {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);

        List<Integer> doubleValuesInList = getDoubleValuesInList(integerList);
        System.out.println(doubleValuesInList);
    }

    private static List<Integer> getDoubleValuesInList(List<Integer> integerList) {
        List<Integer> doubledList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            doubledList.add(integerList.get(i) * 2);
        }
        return doubledList;
    }
}
