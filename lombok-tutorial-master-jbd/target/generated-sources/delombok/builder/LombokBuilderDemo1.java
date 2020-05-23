package com.javabydeveloper.lombok.builder;

public class LombokBuilderDemo1 {
	private Long id;
	private String name;

	LombokBuilderDemo1(final Long id, final String name) {
		this.id = id;
		this.name = name;
	}


	public static class Builder {
		private Long id;
		private String name;

		Builder() {
		}

		public LombokBuilderDemo1.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokBuilderDemo1.Builder name(final String name) {
			this.name = name;
			return this;
		}

		public LombokBuilderDemo1 build() {
			return new LombokBuilderDemo1(this.id, this.name);
		}

		@Override
		public String toString() {
			return "LombokBuilderDemo1.Builder(id=" + this.id + ", name=" + this.name + ")";
		}
	}

	public static LombokBuilderDemo1.Builder builder() {
		return new LombokBuilderDemo1.Builder();
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	//private static boolean defaultStatus;
	//private final double minSalary = 10000.00;
	//private final int defaultRole;
}
