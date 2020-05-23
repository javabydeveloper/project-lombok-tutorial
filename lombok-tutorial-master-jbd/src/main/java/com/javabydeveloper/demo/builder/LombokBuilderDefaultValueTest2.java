package com.javabydeveloper.demo.builder;

import com.javabydeveloper.lombok.builder.LombokBuilderDefaultValueDemo2;

public class LombokBuilderDefaultValueTest2 {

	public static void main(String[] args) {
		
		LombokBuilderDefaultValueDemo2 lbdvd2 = new LombokBuilderDefaultValueDemo2();	
		
		System.out.println(lbdvd2);
		
		LombokBuilderDefaultValueDemo2 lbdvd3 = new LombokBuilderDefaultValueDemo2().toBuilder()
				.build();
		
		System.out.println(lbdvd3);

		// toBuilder()
		LombokBuilderDefaultValueDemo2 lbdvd4 = new LombokBuilderDefaultValueDemo2().toBuilder()
				.id(Long.valueOf(2))
				.active(true)
				.role(5)
				.build();
		
		System.out.println("toBuilder => "+lbdvd4);
		
		// builder()
		LombokBuilderDefaultValueDemo2 lbdvd5 = LombokBuilderDefaultValueDemo2.builder()
				.id(Long.valueOf(2))
				.active(true)
				.role(5)
				.build();
		
		System.out.println("builder => "+lbdvd5);
	}
}
