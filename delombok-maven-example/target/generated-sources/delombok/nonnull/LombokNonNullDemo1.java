package com.javabydeveloper.lombok.nonnull;

import lombok.NonNull;

public class LombokNonNullDemo1 {
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private Boolean active;

	public Double getSurcharge(@NonNull Double transactionAmt) {
		if (transactionAmt == null) {
			throw new NullPointerException("transactionAmt is marked non-null but is null");
		}
		return Math.PI;
	}

	public LombokNonNullDemo1(final Long id, @NonNull final String name, @NonNull final Boolean active) {
		if (name == null) {
			throw new NullPointerException("name is marked non-null but is null");
		}
		if (active == null) {
			throw new NullPointerException("active is marked non-null but is null");
		}
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public LombokNonNullDemo1(@NonNull final String name, @NonNull final Boolean active) {
		if (name == null) {
			throw new NullPointerException("name is marked non-null but is null");
		}
		if (active == null) {
			throw new NullPointerException("active is marked non-null but is null");
		}
		this.name = name;
		this.active = active;
	}

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
}
