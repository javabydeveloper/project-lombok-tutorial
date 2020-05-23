package com.javabydeveloper.lombok.equals;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(doNotUseGetters = true)
@Getter
public class EqualsHashCodeDemo8 {
	
	private Long id;
	
}
