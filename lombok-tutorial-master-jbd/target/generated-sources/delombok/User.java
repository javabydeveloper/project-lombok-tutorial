package com.javabydeveloper.lombok;

import java.time.LocalDate;

public class User {
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate lastUpdated;
	private boolean active;

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
}
