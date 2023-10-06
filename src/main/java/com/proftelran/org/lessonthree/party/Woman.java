package com.proftelran.org.lessonthree.party;

public class Woman extends Guest implements LikeDance{

    public Woman(String name, int age) {
        super(name, "F", age);
    }

    @Override
    public void dance() {
        System.out.println("I am " + super.getName() + " and I want to dance");
    }
}
