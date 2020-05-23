package com.javabydeveloper.lombok.equals;

public class EqualsHashCodeDemo5 {
	private Long id;
	private double salary;

	private boolean isHighPay() {
		return this.salary > 100000.0;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo5)) return false;
		final EqualsHashCodeDemo5 other = (EqualsHashCodeDemo5) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		if (this.isHighPay() != other.isHighPay()) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof EqualsHashCodeDemo5;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		result = result * PRIME + (this.isHighPay() ? 79 : 97);
		return result;
	}
}
