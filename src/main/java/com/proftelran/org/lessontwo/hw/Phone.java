package com.proftelran.org.lessontwo.hw;

public class Phone {

    private String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(String numberToCall) {
        System.out.println(" try to make a call to number " + numberToCall);
    }

    public void receiveCall(String numberWitchCall) {
        System.out.println(" try to receive a call from number " + numberWitchCall);
    }
}