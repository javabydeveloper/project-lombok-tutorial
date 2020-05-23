package com.javabydeveloper.lombok.builder;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter 
@Builder(builderClassName = "Builder")
public class LombokBuilderDemo4 {

	private Long id;

	private List<String> names;
	
}
