package com.javabydeveloper.lombok.toString;

public class LombokToStringDemo2 {
	private Long id;
	private String name;

	@Override
	public String toString() {
		return "LombokToStringDemo2(" + this.id + ", " + this.name + ")";
	}
}
