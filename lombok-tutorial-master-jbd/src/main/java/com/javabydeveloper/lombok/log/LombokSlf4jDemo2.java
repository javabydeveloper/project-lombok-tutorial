package com.javabydeveloper.lombok.log;


import lombok.CustomLog;

@CustomLog
public class LombokSlf4jDemo2 {

	public Double getSurcharge(Double transaction) {
		
		logger.info("Surcharge Calculation begins");
		logger.info("Surcharge amount " + "transaction"); 

		if (transaction.isNaN(transaction)) {
			logger.warning(transaction + " is not a valid amount"); 
			throw new RuntimeException("Invalid Transaction");
		}

		return Math.PI;
	}
}
