package org.designPatterns.observerDP.AmazonStockNotifier.observable;

import org.designPatterns.observerDP.AmazonStockNotifier.observer.NotifierSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IphoneAmazonStock implements StockObservable {

    int stockCount;
    Set<NotifierSystem> devices;

    public IphoneAmazonStock(int stockCount) {
        this.stockCount = stockCount;
        this.devices = new HashSet<>();
    }

    @Override
    public void subscribe(NotifierSystem notifierSystem) {
        devices.add(notifierSystem);
    }

    @Override
    public void unsubscribe(NotifierSystem notifierSystem) {
        devices.remove(notifierSystem);
    }

    @Override
    public void setData(int newCount) {
        if(stockCount == 0 && newCount != 0){
            sendNotification();
        }
        this.stockCount += newCount;
    }

    @Override
    public int getData() {
        return this.stockCount;
    }

    @Override
    public void sendNotification() {
        devices.forEach( device -> device.update(this));
    }

    @Override
    public void removeStock(int purchased) {
        stockCount = purchased>=stockCount ? 0 : (stockCount-purchased);
    }
}
