package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;

public class UPIPay implements PaymentMethod {

    @Override
    public PaymentResult pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using UPI");
        return new PaymentResult(true, "UPI payment processed successfully");
    }

}
