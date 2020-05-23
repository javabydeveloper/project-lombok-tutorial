package com.javabydeveloper.lombok.constructor;

public class NoArgsDemo5 {
	private Long id;
	private String username;

	private NoArgsDemo5() {
	}

	public static NoArgsDemo5 getInstance() {
		return new NoArgsDemo5();
	}
}
