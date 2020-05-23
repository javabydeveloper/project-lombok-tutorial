package com.javabydeveloper.lombok.builder;

import java.util.Map;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Builder(builderClassName = "Builder")
@Getter @ToString
public class LombokSingularDemo2 {

	private Long id;

	@Singular
	private Map<Integer, String> students;
}
