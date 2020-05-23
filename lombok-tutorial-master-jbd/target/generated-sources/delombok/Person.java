package com.javabydeveloper.lombok;

public class Person {
	private String address;

	public Person() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Person)) return false;
		final Person other = (Person) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$address = this.getAddress();
		final Object other$address = other.getAddress();
		if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Person;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $address = this.getAddress();
		result = result * PRIME + ($address == null ? 43 : $address.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Person(address=" + this.getAddress() + ")";
	}
}
