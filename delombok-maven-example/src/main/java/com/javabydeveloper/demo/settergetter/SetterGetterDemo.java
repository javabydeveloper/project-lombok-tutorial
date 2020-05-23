package com.javabydeveloper.demo.settergetter;

import com.javabydeveloper.lombok.settergetter.User;

public class SetterGetterDemo {

	public static void main(String[] args) {

		User user = new User(Long.valueOf(1), "test@email.com", true);

		user.setEmail("contact@email.com");
		System.out.println("id: "+user.getId());
		System.out.println("email: "+user.getEmail());
		System.out.println("active: "+user.isActive());
	}
}
