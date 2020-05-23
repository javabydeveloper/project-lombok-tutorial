package com.javabydeveloper.lombok.nonnull;

import lombok.NonNull;


public class LombokNonNullDemo3 {

	private Long id;
	private String name;
	
	public LombokNonNullDemo3(@NonNull Long id, @NonNull String name) {
		this.id = id;
		this.name = name;
	}
	
}
