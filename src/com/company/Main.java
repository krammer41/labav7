package com.company;

public class Main {

    public static void main(String[] args) {
        formulationOfTheProblem();

        Notation n = new Notation();
        System.out.println("_________________________");
        System.out.println(n.getNameOfTheSubscriber());
        n.setNameOfSubscriber("Li Pattern");
        System.out.println(n.getNameOfTheSubscriber());

        System.out.println("_________________________");
        System.out.println(n.getPhoneNumber());
        n.setPhoneNumber("+380997630991");
        System.out.println(n.getPhoneNumber());

        System.out.println("_________________________");

        System.out.println(n.subscriberAddress.getSubscriberAddress());
        n.subscriberAddress.setSubscriberAddress("Odessa", "Dovga", "11");
        System.out.println(n.subscriberAddress.getSubscriberAddress());


    }

    public static void formulationOfTheProblem() {
        System.out.println("Создать базу данных - телефонный справочник некоторой АТС города. Каждая запись содержит следующие сведения:\n" +
                "\uF02D\tномер телефона;\n" +
                "\uF02D\tФИО абонента ;\n" +
                "\uF02D\tадрес абонента.\n" +
                "Предусмотреть:\n" +
                "а) выдачу сведений об абоненте по его телефонному номеру;\n" +
                "б) выдачу телефонного номера по фамилии абонента;\n" +
                "в) назначение заданного телефонного номера другому владельцу;\n" +
                "г) выдачу списка свободных телефонных номеров.\n");
    }


}
