package com.javabydeveloper.lombok.settergetter;

import lombok.Getter;

public class Payment {

	@Getter
	private Long id;
	
	@Getter
	private String status = simpleDefaultStatus();

	@Getter(lazy=true)
	private final double surCharge = complexSurchargeLogic();

	private double complexSurchargeLogic() {
	
		Double surcharge = Math.PI;
		System.out.println("Called Lazy getSurcharge method");

		return surcharge;
	}
	
	private String simpleDefaultStatus() {
		System.out.println("Called EAGER getStatus method");
		return "NOT_INITIALIZED";
	}
}
