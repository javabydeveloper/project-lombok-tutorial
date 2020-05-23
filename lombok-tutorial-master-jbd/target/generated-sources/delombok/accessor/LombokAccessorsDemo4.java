package com.javabydeveloper.lombok.accessor;

public class LombokAccessorsDemo4 {
	private Long id;
	private String userName;
	private boolean active;
	private boolean is_admin;
	private String authcode;
	private String hash$key;

	public Long getId() {
		return this.id;
	}

	public String userName() {
		return this.userName;
	}

	public boolean isActive() {
		return this.active;
	}

	public boolean isAdmin() {
		return this.is_admin;
	}

	public String getAuthcode() {
		return this.authcode;
	}

	public String getKey() {
		return this.hash$key;
	}

	public LombokAccessorsDemo4 setId(final Long id) {
		this.id = id;
		return this;
	}

	public LombokAccessorsDemo4 userName(final String userName) {
		this.userName = userName;
		return this;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

	public void setAdmin(final boolean is_admin) {
		this.is_admin = is_admin;
	}

	public void setAuthcode(final String authcode) {
		this.authcode = authcode;
	}

	public void setKey(final String hash$key) {
		this.hash$key = hash$key;
	}
}
