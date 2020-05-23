package com.javabydeveloper.lombok;

import java.time.LocalDate;

public class Employee extends Person {
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate lastUpdated;
	private boolean active;

	public Employee() {
	}

	public Long getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public LocalDate getLastUpdated() {
		return this.lastUpdated;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setLastUpdated(final LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee(id=" + this.getId() + ", username=" + this.getUsername() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", email=" + this.getEmail() + ", lastUpdated=" + this.getLastUpdated() + ", active=" + this.isActive() + ")";
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Employee)) return false;
		final Employee other = (Employee) o;
		if (!other.canEqual((Object) this)) return false;
		if (!super.equals(o)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$username = this.getUsername();
		final Object other$username = other.getUsername();
		if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
		final Object this$firstName = this.getFirstName();
		final Object other$firstName = other.getFirstName();
		if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
		final Object this$lastName = this.getLastName();
		final Object other$lastName = other.getLastName();
		if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
		final Object this$email = this.getEmail();
		final Object other$email = other.getEmail();
		if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
		final Object this$lastUpdated = this.getLastUpdated();
		final Object other$lastUpdated = other.getLastUpdated();
		if (this$lastUpdated == null ? other$lastUpdated != null : !this$lastUpdated.equals(other$lastUpdated)) return false;
		if (this.isActive() != other.isActive()) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Employee;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = super.hashCode();
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $username = this.getUsername();
		result = result * PRIME + ($username == null ? 43 : $username.hashCode());
		final Object $firstName = this.getFirstName();
		result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
		final Object $lastName = this.getLastName();
		result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
		final Object $email = this.getEmail();
		result = result * PRIME + ($email == null ? 43 : $email.hashCode());
		final Object $lastUpdated = this.getLastUpdated();
		result = result * PRIME + ($lastUpdated == null ? 43 : $lastUpdated.hashCode());
		result = result * PRIME + (this.isActive() ? 79 : 97);
		return result;
	}
}
