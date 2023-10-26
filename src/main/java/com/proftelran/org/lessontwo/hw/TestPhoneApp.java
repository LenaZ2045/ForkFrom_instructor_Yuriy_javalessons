package com.proftelran.org.lessontwo.hw;

public class TestPhoneApp {

    public static void main(String[] args) {
        //Start task one
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setOwnNumber("123-123-123");
        buttonPhone.setPhoneName("button phone");
        //Call to "456-456-456"
        buttonPhone.call("456-456-456");
        //Receive from "567-567-567"
        buttonPhone.receiveCall("567-567-567");

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setOwnNumber("234-234-234");
        radioPhone.setPhoneName("radio phone");
        //Call to "567-567-567"
        radioPhone.call("567-567-567");
        //Receive from "456-456-456"
        radioPhone.receiveCall("456-456-456");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("smart phone");
        smartPhone.setOwnNumber("789-789-789");
        //Call to "567-567-567"
        smartPhone.call("567-567-567");
        //Receive from "456-456-456"
        smartPhone.receiveCall("456-456-456");
        //End task one

        //Start task two with *
        makeCall(buttonPhone, "123-000-000");
        makeCall(smartPhone, "123-000-001");
        makeCall(radioPhone, "123-000-002");

        receiveCall(radioPhone, "456-000-001");
        receiveCall(buttonPhone, "456-000-002");
        receiveCall(smartPhone, "456-000-003");

        //End task two
    }

    //Use parent type to for variable "phone" to receive any class(ButtonPhone,SmartPhone,RadioPhone)
    private static void makeCall(Phone phone, String number) {
        phone.call(number);
    }

    //Use parent type to for variable "phone" to receive any class(ButtonPhone,SmartPhone,RadioPhone)
    private static void receiveCall(Phone phone, String number) {
        phone.receiveCall(number);
    }
}