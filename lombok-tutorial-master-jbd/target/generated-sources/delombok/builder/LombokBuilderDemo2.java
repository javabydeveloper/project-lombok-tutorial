package com.javabydeveloper.lombok.builder;

public class LombokBuilderDemo2 {
	private Long id;
	private String name;
	private boolean status;
	private int role;

	public LombokBuilderDemo2(Long id, int role) {
		this.id = id;
		this.role = role;
	}


	public static class LombokBuilderDemo2Builder {
		private Long id;
		private int role;

		LombokBuilderDemo2Builder() {
		}

		public LombokBuilderDemo2.LombokBuilderDemo2Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokBuilderDemo2.LombokBuilderDemo2Builder role(final int role) {
			this.role = role;
			return this;
		}

		public LombokBuilderDemo2 build() {
			return new LombokBuilderDemo2(this.id, this.role);
		}

		@Override
		public String toString() {
			return "LombokBuilderDemo2.LombokBuilderDemo2Builder(id=" + this.id + ", role=" + this.role + ")";
		}
	}

	public static LombokBuilderDemo2.LombokBuilderDemo2Builder builder() {
		return new LombokBuilderDemo2.LombokBuilderDemo2Builder();
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
