package com.javabydeveloper.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "getInstance")
@NoArgsConstructor
public class AllArgsDemo5 {

	private Long id;
	
	private String username;
	
}
