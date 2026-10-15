package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;

public class DebitCardPay implements PaymentMethod {

    @Override
    public PaymentResult pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Debit Card");
        return new PaymentResult(true, "Debit card payment processed successfully");
    }

}
