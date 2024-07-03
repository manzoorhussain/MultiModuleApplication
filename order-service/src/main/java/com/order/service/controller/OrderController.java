package com.order.service.controller;

import com.order.service.feignclient.PaymentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/order")
public class OrderController {


  String userLanguage = "User Order";

  @Autowired
  private PaymentClient paymentClient;

  @GetMapping("/get")
  @ResponseBody
  public String getRateHome() {

    return userLanguage;

  }


  @GetMapping("/place-order/{amount}")
  @ResponseBody
  public String placeOrder(@PathVariable Integer amount) {
    boolean flag = paymentClient.checkPayment(amount);
    return flag ? "Order Placed" : "Insufficient Balance ";
  }
}
