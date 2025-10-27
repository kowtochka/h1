package com.sibsutis.devices;
public abstract class device{
    protected int id;
    protected int price;
    protected String ip;
}
    public device(int id, int price, String ip){
        this.id=id;
        this.price=price;
        this.ip=ip;
    }
   public abstract String getDeviceType();
    @Override
     public String toString() {
        return "Device{id=" + id + ", price=" + price + ", ip='" + ip + "'}";
     }
      @Override
    public String print() {
        return "Device Info: " + toString();
    }
