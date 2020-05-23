package com.javabydeveloper.lombok.nonnull;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class LombokNonNullDemo4 {

	@NonNull
	private Long id;
	
	private String name;
	
	private final Integer role;
	
	@NonNull
	private Boolean status;
		
}
