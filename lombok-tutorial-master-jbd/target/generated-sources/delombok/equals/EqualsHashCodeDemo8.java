package com.javabydeveloper.lombok.equals;

public class EqualsHashCodeDemo8 {
	private Long id;

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo8)) return false;
		final EqualsHashCodeDemo8 other = (EqualsHashCodeDemo8) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof EqualsHashCodeDemo8;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		return result;
	}

	public Long getId() {
		return this.id;
	}
}
