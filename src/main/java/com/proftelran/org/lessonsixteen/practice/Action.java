package com.proftelran.org.lessonsixteen.practice;

@FunctionalInterface
public interface Action {

    void action(int code, HttpCodes enumCode);
}
