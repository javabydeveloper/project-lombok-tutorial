package com.javabydeveloper.lombok.equals;

public class EqualsHashCodeDemo3 {
	private Long id;
	private String name;
	private String email;

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo3)) return false;
		final EqualsHashCodeDemo3 other = (EqualsHashCodeDemo3) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof EqualsHashCodeDemo3;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		return result;
	}
}
