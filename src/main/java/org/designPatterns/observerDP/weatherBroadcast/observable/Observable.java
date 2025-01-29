package org.designPatterns.observerDP.weatherBroadcast.observable;

import org.designPatterns.observerDP.weatherBroadcast.observer.Device;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

    void subscribe(Device devices);

    void unsubscribe(Device devices);

    void setData(Double newTemp);

    Double getData();

    void notifyDevices();

}
