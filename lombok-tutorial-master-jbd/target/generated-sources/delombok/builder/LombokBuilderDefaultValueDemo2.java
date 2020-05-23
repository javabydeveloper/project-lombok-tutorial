package com.javabydeveloper.lombok.builder;

public class LombokBuilderDefaultValueDemo2 {
	private Long id;
	private String name = "anonymous";
	private boolean active;
	private int role;
	private double salary;
	private int defaultRole = 3;


	public static class Builder {
		private Long id;
		private String name;
		private boolean active;
		private int role;
		private double salary;
		private int defaultRole;

		Builder() {
		}

		public LombokBuilderDefaultValueDemo2.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokBuilderDefaultValueDemo2.Builder name(final String name) {
			this.name = name;
			return this;
		}

		public LombokBuilderDefaultValueDemo2.Builder active(final boolean active) {
			this.active = active;
			return this;
		}

		public LombokBuilderDefaultValueDemo2.Builder role(final int role) {
			this.role = role;
			return this;
		}

		public LombokBuilderDefaultValueDemo2.Builder salary(final double salary) {
			this.salary = salary;
			return this;
		}

		public LombokBuilderDefaultValueDemo2.Builder defaultRole(final int defaultRole) {
			this.defaultRole = defaultRole;
			return this;
		}

		public LombokBuilderDefaultValueDemo2 build() {
			return new LombokBuilderDefaultValueDemo2(this.id, this.name, this.active, this.role, this.salary, this.defaultRole);
		}

		@Override
		public String toString() {
			return "LombokBuilderDefaultValueDemo2.Builder(id=" + this.id + ", name=" + this.name + ", active=" + this.active + ", role=" + this.role + ", salary=" + this.salary + ", defaultRole=" + this.defaultRole + ")";
		}
	}

	public static LombokBuilderDefaultValueDemo2.Builder builder() {
		return new LombokBuilderDefaultValueDemo2.Builder();
	}

	public LombokBuilderDefaultValueDemo2.Builder toBuilder() {
		return new LombokBuilderDefaultValueDemo2.Builder().id(this.id).name(this.name).active(this.active).role(this.role).salary(this.salary).defaultRole(this.defaultRole);
	}

	@Override
	public String toString() {
		return "LombokBuilderDefaultValueDemo2(id=" + this.id + ", name=" + this.name + ", active=" + this.active + ", role=" + this.role + ", salary=" + this.salary + ", defaultRole=" + this.defaultRole + ")";
	}

	public LombokBuilderDefaultValueDemo2() {
	}

	public LombokBuilderDefaultValueDemo2(final Long id, final String name, final boolean active, final int role, final double salary, final int defaultRole) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.role = role;
		this.salary = salary;
		this.defaultRole = defaultRole;
	}
}
