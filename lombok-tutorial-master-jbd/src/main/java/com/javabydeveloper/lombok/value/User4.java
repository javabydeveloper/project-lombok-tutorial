package com.javabydeveloper.lombok.value;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

@Value
public class User4 {

	private Long id;

	@Getter(value = AccessLevel.NONE)
	private String username;
	
	@ToString.Exclude
	private boolean active;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private int role;
	
}
