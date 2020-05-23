package com.javabydeveloper.lombok.log;

public class LombokSlf4jDemo3 {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("PaymentSurcharge");

	public Double getSurcharge(Double transaction) {
		logger.info("Surcharge Calculation begins");
		logger.debug("Surcharge amount " + transaction);
		return Math.PI;
	}
}
