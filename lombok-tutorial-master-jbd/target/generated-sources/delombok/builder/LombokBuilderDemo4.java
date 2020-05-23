package com.javabydeveloper.lombok.builder;

import java.util.List;

public class LombokBuilderDemo4 {
	private Long id;
	private List<String> names;

	LombokBuilderDemo4(final Long id, final List<String> names) {
		this.id = id;
		this.names = names;
	}


	public static class Builder {
		private Long id;
		private List<String> names;

		Builder() {
		}

		public LombokBuilderDemo4.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokBuilderDemo4.Builder names(final List<String> names) {
			this.names = names;
			return this;
		}

		public LombokBuilderDemo4 build() {
			return new LombokBuilderDemo4(this.id, this.names);
		}

		@Override
		public String toString() {
			return "LombokBuilderDemo4.Builder(id=" + this.id + ", names=" + this.names + ")";
		}
	}

	public static LombokBuilderDemo4.Builder builder() {
		return new LombokBuilderDemo4.Builder();
	}

	public Long getId() {
		return this.id;
	}

	public List<String> getNames() {
		return this.names;
	}
}
