package com.javabydeveloper.lombok.equals;

import java.time.LocalDate;

public class EqualsHashCodeDemo2 {
	private Long id;
	private static int defaultRole = 1;
	private LocalDate dob;
	private transient String dobString;

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo2)) return false;
		final EqualsHashCodeDemo2 other = (EqualsHashCodeDemo2) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$dob = this.dob;
		final Object other$dob = other.dob;
		if (this$dob == null ? other$dob != null : !this$dob.equals(other$dob)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof EqualsHashCodeDemo2;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $dob = this.dob;
		result = result * PRIME + ($dob == null ? 43 : $dob.hashCode());
		return result;
	}
}
