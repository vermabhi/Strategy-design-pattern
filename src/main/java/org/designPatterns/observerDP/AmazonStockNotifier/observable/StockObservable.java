package org.designPatterns.observerDP.AmazonStockNotifier.observable;

import org.designPatterns.observerDP.AmazonStockNotifier.observer.NotifierSystem;

public interface StockObservable {

    void subscribe(NotifierSystem notifierSystem);

    void unsubscribe(NotifierSystem notifierSystem);

    void setData(int newCount);

    int getData();

    void sendNotification();

    void removeStock(int purchased);
}
