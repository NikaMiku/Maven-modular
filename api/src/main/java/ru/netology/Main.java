package ru.netology;

public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntry());
        System.out.println(myService.setMyEntry(new MyEntry("second")));
        System.out.println(myService.getMyEntry());
    }
}