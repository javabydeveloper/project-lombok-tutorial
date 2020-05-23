package com.javabydeveloper.lombok.equals;

public class Rectangle {
	private double width;
	private double length;

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Rectangle)) return false;
		final Rectangle other = (Rectangle) o;
		if (!other.canEqual((Object) this)) return false;
		if (Double.compare(this.width, other.width) != 0) return false;
		if (Double.compare(this.length, other.length) != 0) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Rectangle;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final long $width = Double.doubleToLongBits(this.width);
		result = result * PRIME + (int) ($width >>> 32 ^ $width);
		final long $length = Double.doubleToLongBits(this.length);
		result = result * PRIME + (int) ($length >>> 32 ^ $length);
		return result;
	}
}
