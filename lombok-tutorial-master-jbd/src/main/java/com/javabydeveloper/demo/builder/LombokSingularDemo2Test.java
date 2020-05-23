package com.javabydeveloper.demo.builder;

import java.util.Map;

import com.javabydeveloper.lombok.builder.LombokSingularDemo2;

public class LombokSingularDemo2Test {

	public static void main(String[] args) {
		
		LombokSingularDemo2 lsd2 = LombokSingularDemo2.builder()
				.id(Long.valueOf(1))
				.student(1, "Peter")
				.student(2, "Martin")
				.students(Map.of(3, "Philip", 4, "Gerhard"))
				.students(Map.of(5, "Alisa"))
				.build();
		
		System.out.println(lsd2);
		
	}
}
