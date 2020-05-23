package com.javabydeveloper.lombok.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "Builder")
public class LombokBuilderDemo1 {

	private Long id;

	private String name;

	//private static boolean defaultStatus;

	//private final double minSalary = 10000.00;

	//private final int defaultRole;

}
