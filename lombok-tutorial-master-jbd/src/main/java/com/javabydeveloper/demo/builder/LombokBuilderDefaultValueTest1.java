package com.javabydeveloper.demo.builder;

import com.javabydeveloper.lombok.builder.LombokBuilderDefaultValueDemo1;

public class LombokBuilderDefaultValueTest1 {

	public static void main(String[] args) {
		
		LombokBuilderDefaultValueDemo1 lbdvd1 = LombokBuilderDefaultValueDemo1.builder()
				.build();
		
		System.out.println(lbdvd1);

	}

}
