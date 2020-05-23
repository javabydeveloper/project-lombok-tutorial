package com.javabydeveloper.demo.constructor;

import com.javabydeveloper.lombok.constructor.AllArgsDemo3;

public class AllArgsDemo3Test {

	public static void main(String[] args) {
		AllArgsDemo3 aad3 = new AllArgsDemo3(Long.valueOf(1), 1);
		System.out.println(aad3.getDefaultRole());
	}
}
