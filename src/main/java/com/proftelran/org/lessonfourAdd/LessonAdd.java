package com.proftelran.org.lessonfourAdd;

import com.proftelran.org.lessonfour.MiddleChild;
import com.proftelran.org.lessonfour.Parent;

public class LessonAdd {

    public static void main(String[] args) {
        Parent parent;
        parent = new MiddleChild();
        parent.printGreetings();
        parent.printThanks();
    }
}
