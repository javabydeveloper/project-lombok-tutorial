package com.javabydeveloper.lombok.toString;

public class LombokToStringDemo8 {
	private Long id;

	@Override
	public String toString() {
		return "LombokToStringDemo8(id=" + this.id + ")";
	}

	public Long getId() {
		return this.id;
	}
}
