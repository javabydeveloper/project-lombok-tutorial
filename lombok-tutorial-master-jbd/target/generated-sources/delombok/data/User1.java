package com.javabydeveloper.lombok.data;

public class User1 {
	private Long id;
	private String username;

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

	public User1() {
	}

	@Override
	public String toString() {
		return "User1(id=" + this.getId() + ", username=" + this.getUsername() + ")";
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof User1)) return false;
		final User1 other = (User1) o;
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
		return other instanceof User1;
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
}
