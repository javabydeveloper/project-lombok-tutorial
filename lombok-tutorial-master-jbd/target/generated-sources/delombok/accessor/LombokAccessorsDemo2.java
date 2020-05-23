package com.javabydeveloper.lombok.accessor;

public class LombokAccessorsDemo2 {
	private Long id;
	private String name;

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public LombokAccessorsDemo2 setId(final Long id) {
		this.id = id;
		return this;
	}

	public LombokAccessorsDemo2 setName(final String name) {
		this.name = name;
		return this;
	}
}
