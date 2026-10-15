package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;

public class PaymentGateway {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentMethod paymentMethod = new UPIPay();
        PaymentResult result = paymentService.processPayment(paymentMethod, new BigDecimal("100.00"));
        System.out.println("Payment Result: " + result.success() + " - " + result.message());
    }
}
