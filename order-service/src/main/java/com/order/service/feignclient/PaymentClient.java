package com.order.service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentClient {

  @GetMapping("/payment/check-payment/{amount}")
  public boolean checkPayment(@PathVariable Double amount);
}
