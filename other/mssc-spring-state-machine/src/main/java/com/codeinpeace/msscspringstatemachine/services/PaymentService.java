package com.codeinpeace.msscspringstatemachine.services;

import com.codeinpeace.msscspringstatemachine.domain.Payment;
import com.codeinpeace.msscspringstatemachine.domain.PaymentEvent;
import com.codeinpeace.msscspringstatemachine.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
