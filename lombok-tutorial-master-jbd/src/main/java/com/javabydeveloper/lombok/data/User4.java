package com.javabydeveloper.lombok.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class User4 {

	@Setter(value = AccessLevel.NONE)
	private Long id;

	@Getter(value = AccessLevel.NONE)
	private String username;
	
	@ToString.Exclude
	private boolean active;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private int role;

}
