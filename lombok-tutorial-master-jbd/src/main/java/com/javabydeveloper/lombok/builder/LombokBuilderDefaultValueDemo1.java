package com.javabydeveloper.lombok.builder;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.ToString;

@ToString
@Builder(builderClassName = "Builder")
public class LombokBuilderDefaultValueDemo1 {

	private Long id;

	@Default
	private String name = "anonymous";
	
	private boolean active;
	
	private int role;
	
	private double salary;
	
	@Default
	private int defaultRole = 3;

}
