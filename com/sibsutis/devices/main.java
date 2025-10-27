package com.sibsutis.devices;

public class Main {
    public static void main(String[] args) {
        Device pc = new PersonalComputer(1, 50000, "192.168.1.10");
        Device phone = new Phone(2, 15000, "192.168.1.11");

        System.out.println(pc.print());
        System.out.println(phone.print());
        System.out.println("PC Type: " + pc.getDeviceType());
        System.out.println("Phone Type: " + phone.getDeviceType());
    }
}