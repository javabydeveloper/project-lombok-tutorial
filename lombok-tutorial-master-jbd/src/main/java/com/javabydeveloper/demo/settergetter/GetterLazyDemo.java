package com.javabydeveloper.demo.settergetter;

import com.javabydeveloper.lombok.settergetter.Payment;

public class GetterLazyDemo {

	public static void main(String[] args) {

		Payment payment = new Payment();

		System.out.println("Eager getters called at instance creation time!");
		double sc = payment.getSurCharge();

	}
}
