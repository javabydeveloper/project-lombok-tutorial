package com.javabydeveloper.lombok.log;


import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "PaymentSurcharge")
public class LombokSlf4jDemo3 {

	public Double getSurcharge(Double transaction) {
		
		logger.info("Surcharge Calculation begins");
		logger.debug("Surcharge amount " + transaction); 
		
		return Math.PI;
	}
}
