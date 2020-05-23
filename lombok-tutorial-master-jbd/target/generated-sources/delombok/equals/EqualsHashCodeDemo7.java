package com.javabydeveloper.lombok.equals;

public class EqualsHashCodeDemo7 {
	private Long id;
	private double salary;
	private String email;

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo7)) return false;
		final EqualsHashCodeDemo7 other = (EqualsHashCodeDemo7) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$email = this.email;
		final Object other$email = other.email;
		if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof EqualsHashCodeDemo7;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $email = this.email;
		result = result * PRIME + ($email == null ? 43 : $email.hashCode());
		return result;
	}
}
