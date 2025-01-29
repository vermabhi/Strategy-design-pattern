package org.designPatterns.observerDP.AmazonStockNotifier.observer;

import org.designPatterns.observerDP.AmazonStockNotifier.observable.IphoneAmazonStock;

public interface NotifierSystem {
    void update(IphoneAmazonStock iphoneAmazonStock);

    void getUnsubscribe();

}
