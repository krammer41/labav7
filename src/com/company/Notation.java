package com.company;

public class Notation {
    String phoneNumber;
    String NameOfTheSubscriber;
    SubscriberAddress subscriberAddress = new SubscriberAddress();

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean setPhoneNumber(String phoneNumber) {
        if (phoneNumber.charAt(0) == '+' && phoneNumber.length() == 13) {
            this.phoneNumber = phoneNumber;
            return true;
        } else return false;

    }

    public String getNameOfTheSubscriber() {
        return this.NameOfTheSubscriber;
    }

    public boolean setNameOfSubscriber(String NameOfTheSubscriber) {
        if(NameOfTheSubscriber.equals(""))//номер свободен
            return true;
        boolean itsTrue = true;
        for (int i = 0; i < NameOfTheSubscriber.length(); i++) {
            if ((Character.isLetter(NameOfTheSubscriber.charAt(i)) == false)
                    && ((NameOfTheSubscriber.charAt(i) != ' '))) {
                itsTrue = false;
                return false;
            }
        }
        if (itsTrue == true)
            this.NameOfTheSubscriber = NameOfTheSubscriber;
        return true;
    }


}
