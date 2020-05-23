package com.javabydeveloper.lombok.equals;

import java.lang.annotation.Native;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.NonFinal;

public class EqualsHashCodeDemo9 {
	private Long id;

	@Override
	public boolean equals(@NonNull final Object o) {
		if (o == null) {
			throw new NullPointerException("o is marked non-null but is null");
		}
		if (o == this) return true;
		if (!(o instanceof EqualsHashCodeDemo9)) return false;
		final EqualsHashCodeDemo9 other = (EqualsHashCodeDemo9) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.id;
		final Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		return true;
	}

	protected boolean canEqual(@NonNull final Object other) {
		return other instanceof EqualsHashCodeDemo9;
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
