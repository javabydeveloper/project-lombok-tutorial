package com.javabydeveloper.lombok.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
public class LombokBuilderDemo3 {

	private Long id;

	private String name;
	
	private boolean status;
	
	private int role;
	
	public LombokBuilderDemo3(Long id, String name, int role, boolean status) {
		this.id = id;
		this.name = name;
	}
	
	@Builder(builderMethodName = "builder", builderClassName = "MyBuilder")
	public static LombokBuilderDemo3 createInstance(Long id, String name) {
		// create instance with default role and status
		return new LombokBuilderDemo3(id, name, 1, false);
	}
}
