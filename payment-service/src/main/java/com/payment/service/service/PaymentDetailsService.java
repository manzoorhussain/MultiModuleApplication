package com.payment.service.service;

import com.payment.service.entity.PaymentDetailEntity;
import com.payment.service.repo.PaymentDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentDetailsService {

  @Autowired
  private PaymentDetailRepo paymentDetailRepo;

  public PaymentDetailEntity findByAmount(Double amount){
    return paymentDetailRepo.findByAmount(amount);
  }

  public PaymentDetailEntity findById(Integer paymentId){
    return paymentDetailRepo.findById(paymentId).orElse(null);
  }
}
