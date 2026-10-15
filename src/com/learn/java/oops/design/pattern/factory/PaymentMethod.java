package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;

public interface PaymentMethod {

    PaymentResult pay(BigDecimal amount);
}
