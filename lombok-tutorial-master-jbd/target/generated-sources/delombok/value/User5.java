package com.javabydeveloper.lombok.value;

import lombok.Builder.Default;

public final class User5 {
	private final Long id;
	private final String username;
	private final boolean active;
	private final int role;

	private static boolean $default$active() {
		return true;
	}

	private static int $default$role() {
		return 3;
	}

	User5(final Long id, final String username, final boolean active, final int role) {
		this.id = id;
		this.username = username;
		this.active = active;
		this.role = role;
	}


	public static class User5Builder {
		private Long id;
		private String username;
		private boolean active$set;
		private boolean active$value;
		private boolean role$set;
		private int role$value;

		User5Builder() {
		}

		public User5.User5Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public User5.User5Builder username(final String username) {
			this.username = username;
			return this;
		}

		public User5.User5Builder active(final boolean active) {
			this.active$value = active;
			active$set = true;
			return this;
		}

		public User5.User5Builder role(final int role) {
			this.role$value = role;
			role$set = true;
			return this;
		}

		public User5 build() {
			boolean active$value = this.active$value;
			if (!this.active$set) active$value = User5.$default$active();
			int role$value = this.role$value;
			if (!this.role$set) role$value = User5.$default$role();
			return new User5(this.id, this.username, active$value, role$value);
		}

		@Override
		public String toString() {
			return "User5.User5Builder(id=" + this.id + ", username=" + this.username + ", active$value=" + this.active$value + ", role$value=" + this.role$value + ")";
		}
	}

	public static User5.User5Builder builder() {
		return new User5.User5Builder();
	}

	public Long getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
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
		if (!(o instanceof User5)) return false;
		final User5 other = (User5) o;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$username = this.getUsername();
		final Object other$username = other.getUsername();
		if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
		if (this.isActive() != other.isActive()) return false;
		if (this.getRole() != other.getRole()) return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $username = this.getUsername();
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		result = result * PRIME + (this.isActive() ? 79 : 97);
		result = result * PRIME + this.getRole();
		return result;
	}

	@Override
	public String toString() {
		return "User5(id=" + this.getId() + ", username=" + this.getUsername() + ", active=" + this.isActive() + ", role=" + this.getRole() + ")";
	}
}
