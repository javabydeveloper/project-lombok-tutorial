package com.javabydeveloper.lombok.toString;

import lombok.Getter;
import lombok.ToString;

@ToString(doNotUseGetters = true)
@Getter
public class LombokToStringDemo8 {

	private Long id;
	
}
