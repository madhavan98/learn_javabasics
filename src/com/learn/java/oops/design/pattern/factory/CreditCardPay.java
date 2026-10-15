package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;

public class CreditCardPay implements PaymentMethod {

    @Override
    public PaymentResult pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        return new PaymentResult(true, "Credit card payment processed successfully");
    }

}
