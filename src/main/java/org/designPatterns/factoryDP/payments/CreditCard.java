package org.designPatterns.factoryDP.payments;

public class CreditCard implements Payments{
    @Override
    public void pay(double amount) {
        System.out.println(amount+" paid by credit card!");
    }
}
