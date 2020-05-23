package com.javabydeveloper.lombok.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Builder(toBuilder = true, builderClassName = "Builder")
@NoArgsConstructor
@AllArgsConstructor
public class LombokBuilderDefaultValueDemo2 {

	private Long id;

	private String name = "anonymous";
	
	private boolean active;
	
	private int role;
	
	private double salary;
	
	private int defaultRole = 3;

}
