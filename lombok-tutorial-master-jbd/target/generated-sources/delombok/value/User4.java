package com.javabydeveloper.lombok.value;

import lombok.EqualsAndHashCode;
import lombok.ToString;

public final class User4 {
	private final Long id;
	private final String username;
	private final boolean active;
	private final int role;

	public User4(final Long id, final String username, final boolean active, final int role) {
		this.id = id;
		this.username = username;
		this.active = active;
		this.role = role;
	}

	public Long getId() {
		return this.id;
	}

	public boolean isActive() {
		return this.active;
	}

	public int getRole() {
		return this.role;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof User4)) return false;
		final User4 other = (User4) o;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$username = this.username;
		final Object other$username = other.username;
		if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
		if (this.isActive() != other.isActive()) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $username = this.username;
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		result = result * PRIME + (this.isActive() ? 79 : 97);
		return result;
	}

	@Override
	public String toString() {
		return "User4(id=" + this.getId() + ", username=" + this.username + ")";
	}
}
