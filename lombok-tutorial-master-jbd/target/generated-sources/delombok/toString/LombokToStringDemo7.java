package com.javabydeveloper.lombok.toString;

public class LombokToStringDemo7 {
	private Long id;
	private String name;
	private boolean status;

	@Override
	public String toString() {
		return "LombokToStringDemo7(id=" + this.id + ", status=" + this.status + ")";
	}
}
