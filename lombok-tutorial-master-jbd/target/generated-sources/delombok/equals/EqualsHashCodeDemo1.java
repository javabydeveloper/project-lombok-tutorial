package com.javabydeveloper.lombok.equals;

public class EqualsHashCodeDemo1 {
	private Long id;
	private String name;

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo1)) return false;
		final EqualsHashCodeDemo1 other = (EqualsHashCodeDemo1) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$name = this.name;
		final Object other$name = other.name;
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof EqualsHashCodeDemo1;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $name = this.name;
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		return result;
	}
}
