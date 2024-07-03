package com.payment.service.controller;

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


  @GetMapping("/get")
  @ResponseBody
  public String getRateHome() {

    return "Payment Service";

  }

  @GetMapping("/check-payment/{amount}")
  @ResponseBody
  public boolean checkPayment(@PathVariable Integer amount) {
    boolean result = false;
    if (amount > 100) {
      result = true;
    }
    return result;

  }


}
