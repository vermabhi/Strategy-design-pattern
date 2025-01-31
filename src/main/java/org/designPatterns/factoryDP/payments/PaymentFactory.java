package org.designPatterns.factoryDP.payments;

public class PaymentFactory {

    public static Payments getPaymentMethod(String method) {
        switch (method.toUpperCase()){
            case "UPI" -> {
                return new UPI();
            }
            case "CREDIT_CARD" -> {
                return new CreditCard();
            }
            case "PAYPAL" -> {
                return new PayPal();
            }
            default -> {
                System.out.println("Unknown Payment method!");
                return null;
            }
        }
    }
}
