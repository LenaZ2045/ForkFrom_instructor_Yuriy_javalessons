package com.proftelran.org.lessonfive;

import java.util.Arrays;

public class SeaBattle {

    private static final int FIELD_LENGTH = 10;

    public static void main(String[] args) {

        char[][] playerOneField = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerTwoField = new char[FIELD_LENGTH][FIELD_LENGTH];

        fieldByDefault(playerOneField);
        fieldByDefault(playerTwoField);

        printField(playerOneField);

        fillFiled(playerOneField);
        fillFiled(playerTwoField);

        startGame(playerOneField, playerTwoField, "One", "Two");
    }

    private static void startGame(char[][] playerOneField, char[][] playerTwoField,
                                  String one, String two) {

    }

    private static void fieldByDefault(char[][] field) {
        for (char[] chars : field) {
            Arrays.fill(chars, '.');
        }
    }

    private static void printField(char[][] field) {
        for (char[] ints : field) {
            for (char anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void fillFiled(char[][] field) {

    }
}