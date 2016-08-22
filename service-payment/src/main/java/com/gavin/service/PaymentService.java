package com.gavin.service;


import com.gavin.domain.payment.Payment;

public interface PaymentService {

    Long createPayment(Payment payment);

    Payment searchPaymentById(Long paymentId);

    void succeedInPayment(Long paymentId);
}
