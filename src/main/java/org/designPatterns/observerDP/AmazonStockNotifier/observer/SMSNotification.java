package org.designPatterns.observerDP.AmazonStockNotifier.observer;

import org.designPatterns.observerDP.AmazonStockNotifier.observable.IphoneAmazonStock;

public class SMSNotification implements NotifierSystem {

    private final  String phoneNumber;
    private final String userName;
    private boolean isActive;

    public SMSNotification(String phoneNumber, String userName) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.isActive = true;
    }

    @Override
    public void update(IphoneAmazonStock iphoneAmazonStock) {
        if(isActive){
            sendSMS();
        }
    }

    @Override
    public void getUnsubscribe() {
        this.isActive = false;
    }

    private void sendSMS(){
        System.out.println(this.userName + " Notification from Amazon via SMS, Iphone in stock!");
    }
}
