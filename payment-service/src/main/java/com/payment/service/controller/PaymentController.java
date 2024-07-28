package com.payment.service.controller;

import com.payment.service.entity.PaymentDetailEntity;
import com.payment.service.service.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/payment")
public class PaymentController {

  @Autowired
  private PaymentDetailsService paymentDetailsService;


  @GetMapping("/get")
  @ResponseBody
  public String getRateHome() {

    return "Payment Service";

  }

  @GetMapping("/check-payment/{amount}")
  @ResponseBody
  public boolean checkPayment(@PathVariable Double amount) {

    PaymentDetailEntity paymentDetailEntity = paymentDetailsService.findByAmount(amount);

    return paymentDetailEntity != null && paymentDetailEntity.getAmount() >= 100;

  }


}
