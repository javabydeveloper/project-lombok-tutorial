package com.javabydeveloper.lombok.toString;

public class LombokToStringDemo6 {
	private Long id;
	private String name;

	@Override
	public String toString() {
		return "LombokToStringDemo6(name=" + this.name + ")";
	}
}
