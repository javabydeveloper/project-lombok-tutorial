package com.javabydeveloper.demo.builder;

import com.javabydeveloper.lombok.builder.LombokBuilderDemo2;

public class LombokBuilderDemo2Test {

	public static void main(String[] args) {

		LombokBuilderDemo2 lbd2 = LombokBuilderDemo2.builder()
				.id(Long.valueOf(1))
				.role(3)
				.build();

		System.out.println("id => " + lbd2.getId());
		System.out.println("role => " + lbd2.getRole());

	}

}
