package com.javabydeveloper.lombok.data;

public class User5 {
	private Long id;
	private String username;


	public static class User5Builder {
		private Long id;
		private String username;

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

		public User5 build() {
			return new User5(this.id, this.username);
		}

		@Override
		public String toString() {
			return "User5.User5Builder(id=" + this.id + ", username=" + this.username + ")";
		}
	}

	public static User5.User5Builder builder() {
		return new User5.User5Builder();
	}

	User5(final Long id, final String username) {
		this.id = id;
		this.username = username;
	}

	public User5() {
	}

	public Long getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof User5)) return false;
		final User5 other = (User5) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$username = this.getUsername();
		final Object other$username = other.getUsername();
		if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof User5;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $username = this.getUsername();
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "User5(id=" + this.getId() + ", username=" + this.getUsername() + ")";
	}
}
