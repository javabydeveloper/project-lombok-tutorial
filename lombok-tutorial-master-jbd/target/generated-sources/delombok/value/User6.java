package com.javabydeveloper.lombok.value;

public class User6 {
	private final Long id;
	private String username;
	public final String defaultStatus = "inactive";
	public static int defaultRole = 2;

	public User6(final Long id, final String username) {
		this.id = id;
		this.username = username;
	}

	public Long getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public String getDefaultStatus() {
		return this.defaultStatus;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof User6)) return false;
		final User6 other = (User6) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$username = this.getUsername();
		final Object other$username = other.getUsername();
		if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
		final Object this$defaultStatus = this.getDefaultStatus();
		final Object other$defaultStatus = other.getDefaultStatus();
		if (this$defaultStatus == null ? other$defaultStatus != null : !this$defaultStatus.equals(other$defaultStatus)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof User6;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $username = this.getUsername();
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		final Object $defaultStatus = this.getDefaultStatus();
		result = result * PRIME + ($defaultStatus == null ? 43 : $defaultStatus.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "User6(id=" + this.getId() + ", username=" + this.getUsername() + ", defaultStatus=" + this.getDefaultStatus() + ")";
	}

	public void setUsername(final String username) {
		this.username = username;
	}
}
