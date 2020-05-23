package com.javabydeveloper.lombok.log;

public class LombokSlf4jDemo1 {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("PaymentSurcharge");

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
