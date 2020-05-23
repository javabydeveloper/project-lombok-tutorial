package com.javabydeveloper.lombok.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
public class LombokBuilderDemo2 {

	private Long id;

	private String name;
	
	private boolean status;
	
	private int role;
	
	@Builder
	public LombokBuilderDemo2(Long id, int role) {
		this.id = id;
		this.role = role;
	}
	
}
