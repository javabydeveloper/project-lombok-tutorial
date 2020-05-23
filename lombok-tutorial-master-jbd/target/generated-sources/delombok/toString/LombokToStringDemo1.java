package com.javabydeveloper.lombok.toString;

import lombok.NonNull;

public class LombokToStringDemo1 {
	private Long id;
	@NonNull
	private String name;
	private static boolean defaultStatus = false;

	@Override
	public String toString() {
		return "LombokToStringDemo1(id=" + this.id + ", name=" + this.name + ")";
	}
}
