package com.javabydeveloper.lombok.nonnull;

import lombok.NonNull;

public class LombokNonNullDemo4 {
	@NonNull
	private Long id;
	private String name;
	private final Integer role;
	@NonNull
	private Boolean status;

	public LombokNonNullDemo4(@NonNull final Long id, final String name, final Integer role, @NonNull final Boolean status) {
		if (id == null) {
			throw new NullPointerException("id is marked non-null but is null");
		}
		if (status == null) {
			throw new NullPointerException("status is marked non-null but is null");
		}
		this.id = id;
		this.name = name;
		this.role = role;
		this.status = status;
	}

	public LombokNonNullDemo4(@NonNull final Long id, final Integer role, @NonNull final Boolean status) {
		if (id == null) {
			throw new NullPointerException("id is marked non-null but is null");
		}
		if (status == null) {
			throw new NullPointerException("status is marked non-null but is null");
		}
		this.id = id;
		this.role = role;
		this.status = status;
	}
}
