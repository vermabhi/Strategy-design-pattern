package org.designPatterns.observerDP.weatherBroadcast;

import org.designPatterns.observerDP.weatherBroadcast.observable.WeatherBroadCast;
import org.designPatterns.observerDP.weatherBroadcast.observer.Digital;
import org.designPatterns.observerDP.weatherBroadcast.observer.Mobile;
import org.designPatterns.observerDP.weatherBroadcast.observer.Web;

public class Main {

    public static void main(String[] args) {
        WeatherBroadCast wb = new WeatherBroadCast();
        wb.subscribe(new Mobile());
        wb.subscribe(new Web());
        wb.subscribe(new Digital());

        wb.setData(56.4);
    }
}
