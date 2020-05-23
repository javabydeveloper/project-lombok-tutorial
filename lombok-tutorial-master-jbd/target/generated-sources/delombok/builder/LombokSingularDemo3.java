package com.javabydeveloper.lombok.builder;

import java.util.List;

public class LombokSingularDemo3 {
	private Long id;
	private List<String> aircraft;

	LombokSingularDemo3(final Long id, final List<String> aircraft) {
		this.id = id;
		this.aircraft = aircraft;
	}


	public static class Builder {
		private Long id;
		private java.util.ArrayList<String> aircraft;

		Builder() {
		}

		public LombokSingularDemo3.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokSingularDemo3.Builder singleAircraft(final String singleAircraft) {
			if (this.aircraft == null) this.aircraft = new java.util.ArrayList<String>();
			this.aircraft.add(singleAircraft);
			return this;
		}

		public LombokSingularDemo3.Builder aircraft(final java.util.Collection<? extends String> aircraft) {
			if (aircraft == null) {
				throw new NullPointerException("aircraft cannot be null");
			}
			if (this.aircraft == null) this.aircraft = new java.util.ArrayList<String>();
			this.aircraft.addAll(aircraft);
			return this;
		}

		public LombokSingularDemo3.Builder clearAircraft() {
			if (this.aircraft != null) this.aircraft.clear();
			return this;
		}

		public LombokSingularDemo3 build() {
			java.util.List<String> aircraft;
			switch (this.aircraft == null ? 0 : this.aircraft.size()) {
			case 0: 
				aircraft = java.util.Collections.emptyList();
				break;
			case 1: 
				aircraft = java.util.Collections.singletonList(this.aircraft.get(0));
				break;
			default: 
				aircraft = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.aircraft));
			}
			return new LombokSingularDemo3(this.id, aircraft);
		}

		@Override
		public String toString() {
			return "LombokSingularDemo3.Builder(id=" + this.id + ", aircraft=" + this.aircraft + ")";
		}
	}

	public static LombokSingularDemo3.Builder builder() {
		return new LombokSingularDemo3.Builder();
	}

	public Long getId() {
		return this.id;
	}

	public List<String> getAircraft() {
		return this.aircraft;
	}

	@Override
	public String toString() {
		return "LombokSingularDemo3(id=" + this.getId() + ", aircraft=" + this.getAircraft() + ")";
	}
}
