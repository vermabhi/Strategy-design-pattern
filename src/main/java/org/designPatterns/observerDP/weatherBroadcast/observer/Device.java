package org.designPatterns.observerDP.weatherBroadcast.observer;

import org.designPatterns.observerDP.weatherBroadcast.observable.WeatherBroadCast;

public interface Device {
    void update(WeatherBroadCast wb);
}
