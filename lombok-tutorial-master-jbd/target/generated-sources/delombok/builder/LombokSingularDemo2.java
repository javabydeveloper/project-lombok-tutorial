package com.javabydeveloper.lombok.builder;

import java.util.Map;
import java.util.Set;

public class LombokSingularDemo2 {
	private Long id;
	private Map<Integer, String> students;

	LombokSingularDemo2(final Long id, final Map<Integer, String> students) {
		this.id = id;
		this.students = students;
	}


	public static class Builder {
		private Long id;
		private java.util.ArrayList<Integer> students$key;
		private java.util.ArrayList<String> students$value;

		Builder() {
		}

		public LombokSingularDemo2.Builder id(final Long id) {
			this.id = id;
			return this;
		}

		public LombokSingularDemo2.Builder student(final Integer studentKey, final String studentValue) {
			if (this.students$key == null) {
				this.students$key = new java.util.ArrayList<Integer>();
				this.students$value = new java.util.ArrayList<String>();
			}
			this.students$key.add(studentKey);
			this.students$value.add(studentValue);
			return this;
		}

		public LombokSingularDemo2.Builder students(final java.util.Map<? extends Integer, ? extends String> students) {
			if (students == null) {
				throw new NullPointerException("students cannot be null");
			}
			if (this.students$key == null) {
				this.students$key = new java.util.ArrayList<Integer>();
				this.students$value = new java.util.ArrayList<String>();
			}
			for (final java.util.Map.Entry<? extends Integer, ? extends String> $lombokEntry : students.entrySet()) {
				this.students$key.add($lombokEntry.getKey());
				this.students$value.add($lombokEntry.getValue());
			}
			return this;
		}

		public LombokSingularDemo2.Builder clearStudents() {
			if (this.students$key != null) {
				this.students$key.clear();
				this.students$value.clear();
			}
			return this;
		}

		public LombokSingularDemo2 build() {
			java.util.Map<Integer, String> students;
			switch (this.students$key == null ? 0 : this.students$key.size()) {
			case 0: 
				students = java.util.Collections.emptyMap();
				break;
			case 1: 
				students = java.util.Collections.singletonMap(this.students$key.get(0), this.students$value.get(0));
				break;
			default: 
				students = new java.util.LinkedHashMap<Integer, String>(this.students$key.size() < 1073741824 ? 1 + this.students$key.size() + (this.students$key.size() - 3) / 3 : Integer.MAX_VALUE);
				for (int $i = 0; $i < this.students$key.size(); $i++) students.put(this.students$key.get($i), (String) this.students$value.get($i));
				students = java.util.Collections.unmodifiableMap(students);
			}
			return new LombokSingularDemo2(this.id, students);
		}

		@Override
		public String toString() {
			return "LombokSingularDemo2.Builder(id=" + this.id + ", students$key=" + this.students$key + ", students$value=" + this.students$value + ")";
		}
	}

	public static LombokSingularDemo2.Builder builder() {
		return new LombokSingularDemo2.Builder();
	}

	public Long getId() {
		return this.id;
	}

	public Map<Integer, String> getStudents() {
		return this.students;
	}

	@Override
	public String toString() {
		return "LombokSingularDemo2(id=" + this.getId() + ", students=" + this.getStudents() + ")";
	}
}
