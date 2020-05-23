package com.javabydeveloper.lombok.constructor;

import java.beans.ConstructorProperties;
import lombok.NoArgsConstructor;

public class AllArgsDemo6 {
	private Long id;
	private String username;

	@ConstructorProperties({"id", "username"})
	public AllArgsDemo6(final Long id, final String username) {
		this.id = id;
		this.username = username;
	}
}
