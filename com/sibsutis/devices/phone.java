package com.sibsutis.devices;
class Phone extends Device {
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "Phone";
    }

    @Override
    public String print() {
        return "Phone Info: " + toString();
    }
}