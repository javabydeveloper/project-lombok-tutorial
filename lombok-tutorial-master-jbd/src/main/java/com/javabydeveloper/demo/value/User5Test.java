package com.javabydeveloper.demo.value;

import com.javabydeveloper.lombok.value.User5;

public class User5Test {

	public static void main(String[] args) {
		
		User5 user5 = User5.builder().build();
		
		System.out.println("user5 => "+user5);
		
		User5 user51 = User5.builder()
				.active(false)
				.id(Long.valueOf(1))
				.role(4)
				.username("Peter")
				.build();
		
		System.out.println("user51 => "+user51);
	}
}
