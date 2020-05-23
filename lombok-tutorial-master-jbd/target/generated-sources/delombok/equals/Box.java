package com.javabydeveloper.lombok.equals;

import lombok.NoArgsConstructor;

public class Box extends Rectangle {
	private double height;

	public Box(final double height) {
		this.height = height;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Box)) return false;
		final Box other = (Box) o;
		if (!other.canEqual((Object) this)) return false;
		if (!super.equals(o)) return false;
		if (Double.compare(this.height, other.height) != 0) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Box;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = super.hashCode();
		final long $height = Double.doubleToLongBits(this.height);
		result = result * PRIME + (int) ($height >>> 32 ^ $height);
		return result;
	}
}
