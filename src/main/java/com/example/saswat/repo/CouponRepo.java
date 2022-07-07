package com.example.saswat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saswat.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
