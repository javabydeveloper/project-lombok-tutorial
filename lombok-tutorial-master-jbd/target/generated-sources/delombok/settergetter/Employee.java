package com.javabydeveloper.lombok.settergetter;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	private Long id;
	private String name;
	private String email;
	private LocalDate lastUpdated;
	private boolean active;
	private transient Date dateOfBirth;
	public static String defaultStatus = "PENDING";

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public LocalDate getLastUpdated() {
		return this.lastUpdated;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

	public void setDateOfBirth(final Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setName(final String name) {
		this.name = name;
	}

	private void setEmail(final String email) {
		this.email = email;
	}

	protected void setLastUpdated(final LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
