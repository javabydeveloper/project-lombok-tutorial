package com.javabydeveloper.lombok.builder;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Builder(builderClassName = "Builder")
@Getter @ToString
public class LombokSingularDemo1 {

	private Long id;

	@Singular
	private List<String> names;
}
