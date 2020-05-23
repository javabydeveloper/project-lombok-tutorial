package com.javabydeveloper.lombok.log;


import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "PaymentSurcharge")
public class LombokSlf4jDemo1 {

	public Double getSurcharge(Double transaction) {
		
		logger.info("Surcharge Calculation begins");
		logger.debug("Surcharge amount " + transaction); 

		if (transaction.isNaN(transaction)) {
			logger.debug(transaction + " is not a valid amount"); 
			throw new RuntimeException("Invalid Transaction");
		}

		return Math.PI;
	}
}
