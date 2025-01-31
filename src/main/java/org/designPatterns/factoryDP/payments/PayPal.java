package org.designPatterns.factoryDP.payments;

public class PayPal implements Payments{
    @Override
    public void pay(double amount) {
        System.out.println(amount+" paid by Paypal!");
    }
}
