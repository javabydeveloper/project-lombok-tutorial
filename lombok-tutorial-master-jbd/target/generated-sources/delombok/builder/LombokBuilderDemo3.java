package com.javabydeveloper.lombok.builder;

public class LombokBuilderDemo3 {
	private Long id;
	private String name;
	private boolean status;
	private int role;

	public LombokBuilderDemo3(Long id, String name, int role, boolean status) {
		this.id = id;
		this.name = name;
	}

	public static LombokBuilderDemo3 createInstance(Long id, String name) {
		// create instance with default role and status
		return new LombokBuilderDemo3(id, name, 1, false);
	}


	public static class MyBuilder {
		private Long id;
		private String name;

		MyBuilder() {
		}

		public LombokBuilderDemo3.MyBuilder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokBuilderDemo3.MyBuilder name(final String name) {
			this.name = name;
			return this;
		}

		public LombokBuilderDemo3 build() {
			return LombokBuilderDemo3.createInstance(this.id, this.name);
		}

		@Override
		public String toString() {
			return "LombokBuilderDemo3.MyBuilder(id=" + this.id + ", name=" + this.name + ")";
		}
	}

	public static LombokBuilderDemo3.MyBuilder builder() {
		return new LombokBuilderDemo3.MyBuilder();
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public boolean isStatus() {
		return this.status;
	}

	public int getRole() {
		return this.role;
	}
}
