package com.javabydeveloper.lombok.accessor;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@Accessors(chain = true)
public class LombokAccessorsDemo2 {

	private Long id;
	
	private String name;
}
