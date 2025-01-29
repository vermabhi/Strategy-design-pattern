package org.designPatterns.observerDP.weatherBroadcast.observable;

import org.designPatterns.observerDP.weatherBroadcast.observer.Device;

import java.util.ArrayList;
import java.util.List;

public class WeatherBroadCast implements Observable{

    List<Device> devices;
    double temp;

    public WeatherBroadCast() {
        this.devices = new ArrayList<>();
        this.temp = 25;
    }

    @Override
    public void subscribe(Device device) {
        devices.add(device);
        System.out.println("device subscribed");
    }

    @Override
    public void setData(Double newTemp) {
        this.temp = newTemp;
        this.notifyDevices();
    }

    @Override
    public void unsubscribe(Device device) {
        if(devices.contains(device)){
            devices.remove(device);
            System.out.println("device unsubscribed");
        }
    }

    @Override
    public Double getData() {
        return this.temp;
    }

    @Override
    public void notifyDevices() {
        devices.forEach(device -> device.update(this));
        System.out.println("Notification send to all devices");
    }
}
