package org.designPatterns.observerDP.AmazonStockNotifier.observer;

import org.designPatterns.observerDP.AmazonStockNotifier.observable.IphoneAmazonStock;

public class EmailNotification implements NotifierSystem {
    private final  String emailId;
    private final String userName;
    private boolean isActive;

    public EmailNotification(String emailId, String userName) {
        this.emailId = emailId;
        this.userName = userName;
        this.isActive = true;
    }

    @Override
    public void update(IphoneAmazonStock iphoneAmazonStock) {
        if(isActive){
            sendEmail();
        }
    }

    @Override
    public void getUnsubscribe() {
        this.isActive = false;
    }

    private void sendEmail(){
        System.out.println(this.userName + " Notification from Amazon via Email, Iphone in stock!");
    }
}
