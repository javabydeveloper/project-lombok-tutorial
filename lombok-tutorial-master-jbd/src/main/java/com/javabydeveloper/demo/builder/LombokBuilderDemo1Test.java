package com.javabydeveloper.demo.builder;

import com.javabydeveloper.lombok.builder.LombokBuilderDemo1;

public class LombokBuilderDemo1Test {

	public static void main(String[] args) {
		
		LombokBuilderDemo1 lbd1 = LombokBuilderDemo1.builder()
				.name("Peter")
				.id(Long.valueOf(1))
				.build();
		
		System.out.println("id => "+lbd1.getId());
		System.out.println("name => "+lbd1.getName());

	}

}
