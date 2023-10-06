package com.proftelran.org.lessonthree.party;

public class GrandFather extends Guest implements LikeDance, DrinkAlcohol{

    public GrandFather(String name, int age) {
        super(name, "M", age);
    }

    @Override
    public void drink() {
        System.out.println("I am cool drinker");
    }

    @Override
    public void dance() {
        System.out.println("I am cool dancer");
    }
}
