package com.javabydeveloper.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter @Getter
public class LombokNonNullDemo1 {

	private Long id;
	
	@NonNull
	private String name;
	
	@NonNull
	private Boolean active;
	
	@NonNull
	private int role;
	
}
