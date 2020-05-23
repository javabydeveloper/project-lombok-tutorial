package com.javabydeveloper.lombok.toString;

public class LombokToStringDemo9 {
	private Long id;
	private String name;
	private boolean status;

	@Override
	public String toString() {
		return "LombokToStringDemo9(userName=" + this.getName() + ", userId=" + this.getId() + ", status=" + this.isStatus() + ")";
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public boolean isStatus() {
		return this.status;
	}
}
