package com.javabydeveloper.lombok.nonnull;

import lombok.NonNull;

public class LombokNonNullDemo1 {
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private Boolean active;
	@NonNull
	private int role;

	public void setId(final Long id) {
		this.id = id;
	}

	public void setName(@NonNull final String name) {
		if (name == null) {
			throw new NullPointerException("name is marked non-null but is null");
		}
		this.name = name;
	}

	public void setActive(@NonNull final Boolean active) {
		if (active == null) {
			throw new NullPointerException("active is marked non-null but is null");
		}
		this.active = active;
	}

	public void setRole(@NonNull final int role) {
		this.role = role;
	}

	public Long getId() {
		return this.id;
	}

	@NonNull
	public String getName() {
		return this.name;
	}

	@NonNull
	public Boolean getActive() {
		return this.active;
	}

	@NonNull
	public int getRole() {
		return this.role;
	}
}
