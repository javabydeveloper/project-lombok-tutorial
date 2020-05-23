package com.javabydeveloper.lombok.accessor;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@Accessors(prefix = {"user", "is_", "auth", "hash$"})
public class LombokAccessorsDemo3 {

	private Long id;
	
	private String userName;
	
	private boolean active;
	
	private boolean is_admin;
	
	private String authcode;
	
	private String hash$key;
	
}
