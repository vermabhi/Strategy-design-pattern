package org.designPatterns.observerDP.weatherBroadcast.observer;

import org.designPatterns.observerDP.weatherBroadcast.observable.WeatherBroadCast;

public class Web implements Device {

    @Override
    public void update(WeatherBroadCast wb) {
        System.out.println("Updated temp on web screen is : " + wb.getData());
    }
}
