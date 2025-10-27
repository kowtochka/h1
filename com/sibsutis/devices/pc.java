package com.sibsutis.devices;
class PersonalComputer extends Device {
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }

    @Override
    public String print() {
        return "Personal Computer Info: " + toString();
    }
}