package com.javabydeveloper.lombok.settergetter;

import javax.annotation.processing.Generated;
import javax.management.ConstructorParameters;
import lombok.NoArgsConstructor;
import lombok.experimental.NonFinal;

public class User {
	private Long id;
	//@Getter(onMethod=@__(@Deprecated)) -- JDK7
	// JDK8
	private String email;
	private boolean active;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

	@ConstructorParameters({"id", "email"})
	public User(final Long id, final String email, final boolean active) {
		this.id = id;
		this.email = email;
		this.active = active;
	}

	@Deprecated
	public String getEmail() {
		return this.email;
	}

	public void setEmail(@NonFinal final String email) {
		this.email = email;
	}

	@Generated("com.javabydeveloper.lombok.settergetter.User")
	@Deprecated
	public boolean isActive() {
		return this.active;
	}
}
