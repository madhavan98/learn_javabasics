package com.learn.java.oops.design.pattern.factory;

import java.math.BigDecimal;
import java.util.Objects;

public class PaymentService {

    public PaymentResult processPayment(PaymentMethod paymentMethod, BigDecimal amount) {
        Objects.requireNonNull(paymentMethod, "Payment method cannot be null");
        Objects.requireNonNull(amount, "Amount cannot be null");

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        return paymentMethod.pay(amount);
    }

}
