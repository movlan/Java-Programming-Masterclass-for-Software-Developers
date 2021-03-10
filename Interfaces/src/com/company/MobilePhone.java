package com.company;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered up");
    }

    @Override
    public void dail(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering on mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is not on ot number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}