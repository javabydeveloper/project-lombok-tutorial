package com.javabydeveloper.lombok.nonnull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter @Getter
public class LombokNonNullDemo1 {

	private Long id;
	
	@NonNull
	private String name;
	
	@NonNull
	private Boolean active;
	
	public Double getSurcharge(@NonNull Double transactionAmt) {
		return Math.PI;
	}
	
}
