package com.javabydeveloper.lombok.builder;

import lombok.Builder.Default;

public class LombokBuilderDefaultValueDemo1 {
	private Long id;
	private String name;
	private boolean active;
	private int role;
	private double salary;
	private int defaultRole;

	private static String $default$name() {
		return "anonymous";
	}

	private static int $default$defaultRole() {
		return 3;
	}

	LombokBuilderDefaultValueDemo1(final Long id, final String name, final boolean active, final int role, final double salary, final int defaultRole) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.role = role;
		this.salary = salary;
		this.defaultRole = defaultRole;
	}


	public static class Builder {
		private Long id;
		private boolean name$set;
		private String name$value;
		private boolean active;
		private int role;
		private double salary;
		private boolean defaultRole$set;
		private int defaultRole$value;

		Builder() {
		}

		public LombokBuilderDefaultValueDemo1.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokBuilderDefaultValueDemo1.Builder name(final String name) {
			this.name$value = name;
			name$set = true;
			return this;
		}

		public LombokBuilderDefaultValueDemo1.Builder active(final boolean active) {
			this.active = active;
			return this;
		}

		public LombokBuilderDefaultValueDemo1.Builder role(final int role) {
			this.role = role;
			return this;
		}

		public LombokBuilderDefaultValueDemo1.Builder salary(final double salary) {
			this.salary = salary;
			return this;
		}

		public LombokBuilderDefaultValueDemo1.Builder defaultRole(final int defaultRole) {
			this.defaultRole$value = defaultRole;
			defaultRole$set = true;
			return this;
		}

		public LombokBuilderDefaultValueDemo1 build() {
			String name$value = this.name$value;
			if (!this.name$set) name$value = LombokBuilderDefaultValueDemo1.$default$name();
			int defaultRole$value = this.defaultRole$value;
			if (!this.defaultRole$set) defaultRole$value = LombokBuilderDefaultValueDemo1.$default$defaultRole();
			return new LombokBuilderDefaultValueDemo1(this.id, name$value, this.active, this.role, this.salary, defaultRole$value);
		}

		@Override
		public String toString() {
			return "LombokBuilderDefaultValueDemo1.Builder(id=" + this.id + ", name$value=" + this.name$value + ", active=" + this.active + ", role=" + this.role + ", salary=" + this.salary + ", defaultRole$value=" + this.defaultRole$value + ")";
		}
	}

	public static LombokBuilderDefaultValueDemo1.Builder builder() {
		return new LombokBuilderDefaultValueDemo1.Builder();
	}

	@Override
	public String toString() {
		return "LombokBuilderDefaultValueDemo1(id=" + this.id + ", name=" + this.name + ", active=" + this.active + ", role=" + this.role + ", salary=" + this.salary + ", defaultRole=" + this.defaultRole + ")";
	}
}
