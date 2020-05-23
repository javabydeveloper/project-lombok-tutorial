package com.javabydeveloper.lombok.accessor;

public class LombokAccessorsDemo3 {
	private Long id;
	private String userName;
	private boolean active;
	private boolean is_admin;
	private String authcode;
	private String hash$key;

	public String getName() {
		return this.userName;
	}

	public boolean isAdmin() {
		return this.is_admin;
	}

	public String getKey() {
		return this.hash$key;
	}

	public void setName(final String userName) {
		this.userName = userName;
	}

	public void setAdmin(final boolean is_admin) {
		this.is_admin = is_admin;
	}

	public void setKey(final String hash$key) {
		this.hash$key = hash$key;
	}
}
