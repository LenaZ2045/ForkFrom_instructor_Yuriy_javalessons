package com.proftelran.org.lessontwo.hw;

public class RadioPhone extends Phone {

    private String ownNumber;

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String numberToCall) {
        //First part phrase in this class
        System.out.println("The phone " + getPhoneName() + " " + ownNumber);
        //Call second part phrase from parent class
        super.call(numberToCall);
    }

    @Override
    public void receiveCall(String numberWitchCall) {
        //First part phrase in this class
        System.out.println("The phone " + getPhoneName() + " " + ownNumber);
        //Call second part phrase from parent class
        super.receiveCall(numberWitchCall);
    }
}
