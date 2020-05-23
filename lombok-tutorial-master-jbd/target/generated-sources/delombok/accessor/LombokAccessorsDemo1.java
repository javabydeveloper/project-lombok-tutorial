package com.javabydeveloper.lombok.accessor;

public class LombokAccessorsDemo1 {
	private Long id;
	private String name;

	public Long id() {
		return this.id;
	}

	public String name() {
		return this.name;
	}

	public LombokAccessorsDemo1 id(final Long id) {
		this.id = id;
		return this;
	}

	public LombokAccessorsDemo1 name(final String name) {
		this.name = name;
		return this;
	}
}
