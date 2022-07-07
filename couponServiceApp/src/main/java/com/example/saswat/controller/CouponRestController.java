package com.example.saswat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CouponRestController {
	
	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public String create() {

		return "Coupon Created";

	}

}
