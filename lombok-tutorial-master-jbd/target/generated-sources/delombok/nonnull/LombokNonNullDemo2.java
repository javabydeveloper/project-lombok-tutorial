package com.javabydeveloper.lombok.nonnull;

import lombok.NonNull;

public class LombokNonNullDemo2 {
	public Double getSurcharge(@NonNull Double transactionAmt) {
		if (transactionAmt == null) {
			throw new NullPointerException("transactionAmt is marked non-null but is null");
		}
		return Math.PI;
	}
}
