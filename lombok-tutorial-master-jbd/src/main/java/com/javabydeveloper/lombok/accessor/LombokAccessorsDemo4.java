package com.javabydeveloper.lombok.accessor;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
public class LombokAccessorsDemo4 {

	@Accessors(chain = true)
	private Long id;
	
	@Accessors(fluent = true)
	private String userName;
	
	private boolean active;
	
	@Accessors(prefix = "is_")
	private boolean is_admin;
	
	private String authcode;
	
	@Accessors(prefix = "hash$")
	private String hash$key;
	
}
