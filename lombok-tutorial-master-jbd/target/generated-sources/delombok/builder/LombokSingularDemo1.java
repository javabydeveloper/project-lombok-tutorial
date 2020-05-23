package com.javabydeveloper.lombok.builder;

import java.util.List;

public class LombokSingularDemo1 {
	private Long id;
	private List<String> names;

	LombokSingularDemo1(final Long id, final List<String> names) {
		this.id = id;
		this.names = names;
	}


	public static class Builder {
		private Long id;
		private java.util.ArrayList<String> names;

		Builder() {
		}

		public LombokSingularDemo1.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokSingularDemo1.Builder name(final String name) {
			if (this.names == null) this.names = new java.util.ArrayList<String>();
			this.names.add(name);
			return this;
		}

		public LombokSingularDemo1.Builder names(final java.util.Collection<? extends String> names) {
			if (names == null) {
				throw new NullPointerException("names cannot be null");
			}
			if (this.names == null) this.names = new java.util.ArrayList<String>();
			this.names.addAll(names);
			return this;
		}

		public LombokSingularDemo1.Builder clearNames() {
			if (this.names != null) this.names.clear();
			return this;
		}

		public LombokSingularDemo1 build() {
			java.util.List<String> names;
			switch (this.names == null ? 0 : this.names.size()) {
			case 0: 
				names = java.util.Collections.emptyList();
				break;
			case 1: 
				names = java.util.Collections.singletonList(this.names.get(0));
				break;
			default: 
				names = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.names));
			}
			return new LombokSingularDemo1(this.id, names);
		}

		@Override
		public String toString() {
			return "LombokSingularDemo1.Builder(id=" + this.id + ", names=" + this.names + ")";
		}
	}

	public static LombokSingularDemo1.Builder builder() {
		return new LombokSingularDemo1.Builder();
	}

	public Long getId() {
		return this.id;
	}

	public List<String> getNames() {
		return this.names;
	}

	@Override
	public String toString() {
		return "LombokSingularDemo1(id=" + this.getId() + ", names=" + this.getNames() + ")";
	}
}
