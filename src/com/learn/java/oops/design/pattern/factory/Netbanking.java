package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;

public class Netbanking implements PaymentMethod {

    @Override
    public PaymentResult pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Netbanking");
        return new PaymentResult(true, "Netbanking payment processed successfully");
    }

}
