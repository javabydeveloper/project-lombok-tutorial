package com.javabydeveloper.demo.builder;

import com.javabydeveloper.lombok.builder.LombokBuilderDemo3;

public class LombokBuilderDemo3Test {

	public static void main(String[] args) {
		
		LombokBuilderDemo3 lbd3 = LombokBuilderDemo3.builder()
				.id(Long.valueOf(1))
				.name("Peter")
				.build();
		
		System.out.println("id => "+lbd3.getId());
		System.out.println("name => "+lbd3.getName());
		System.out.println("role => "+lbd3.getRole());
		System.out.println("status => "+lbd3.isStatus());
		
	}

}
