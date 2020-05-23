package com.javabydeveloper.lombok.log;

public class LombokSlf4jDemo2 {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LombokSlf4jDemo2.class.getName());

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
