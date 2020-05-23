package com.javabydeveloper.lombok.nonnull;

import lombok.NonNull;

public class LombokNonNullDemo3 {
	private Long id;
	private String name;

	public LombokNonNullDemo3(@NonNull Long id, @NonNull String name) {
		if (id == null) {
			throw new NullPointerException("id is marked non-null but is null");
		}
		if (name == null) {
			throw new NullPointerException("name is marked non-null but is null");
		}
		this.id = id;
		this.name = name;
	}
}
