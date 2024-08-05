package com.payment.service.repo;

import com.payment.service.entity.PaymentDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailRepo extends JpaRepository<PaymentDetailEntity,Integer> {
  public PaymentDetailEntity findByAmount(Double amount);

}
