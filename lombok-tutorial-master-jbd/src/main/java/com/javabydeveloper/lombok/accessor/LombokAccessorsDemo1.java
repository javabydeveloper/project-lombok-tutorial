package com.javabydeveloper.lombok.accessor;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@Accessors(fluent = true)
public class LombokAccessorsDemo1 {

	private Long id;
	
	private String name;
}
