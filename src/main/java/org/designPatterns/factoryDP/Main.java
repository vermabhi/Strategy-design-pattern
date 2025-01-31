package org.designPatterns.factoryDP;

import org.designPatterns.factoryDP.payments.PaymentFactory;
import org.designPatterns.factoryDP.payments.Payments;

public class Main {

    public static void main(String[] args) {
        Payments payments = PaymentFactory.getPaymentMethod("paypal");
        payments.pay(123);
    }
}
