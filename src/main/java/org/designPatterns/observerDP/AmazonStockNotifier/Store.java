package org.designPatterns.observerDP.AmazonStockNotifier;

import org.designPatterns.observerDP.AmazonStockNotifier.observable.IphoneAmazonStock;
import org.designPatterns.observerDP.AmazonStockNotifier.observable.StockObservable;
import org.designPatterns.observerDP.AmazonStockNotifier.observer.EmailNotification;
import org.designPatterns.observerDP.AmazonStockNotifier.observer.NotifierSystem;
import org.designPatterns.observerDP.AmazonStockNotifier.observer.SMSNotification;


public class Store {

    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneAmazonStock(0);
        NotifierSystem notifierSystem1 = new SMSNotification("12345678900", "Abhi");
        NotifierSystem notifierSystem2 = new SMSNotification("12345678900", "Abhishek");

        NotifierSystem notifierSystem3 = new EmailNotification("a@gmail.com", "Ram");
        NotifierSystem notifierSystem4 = new EmailNotification("b@gmail.com", "Shyam");

        stockObservable.subscribe(notifierSystem1);
        stockObservable.subscribe(notifierSystem4);
        stockObservable.subscribe(notifierSystem3);
        stockObservable.subscribe(notifierSystem2);

        stockObservable.setData(10);
        notifierSystem2.getUnsubscribe();
        stockObservable.unsubscribe(notifierSystem3);
        stockObservable.removeStock(5);
        stockObservable.setData(5);
        stockObservable.removeStock(12);

        stockObservable.setData(3);

    }
}
