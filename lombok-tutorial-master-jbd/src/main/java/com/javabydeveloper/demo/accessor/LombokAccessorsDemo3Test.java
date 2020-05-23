package com.javabydeveloper.demo.accessor;

import com.javabydeveloper.lombok.accessor.LombokAccessorsDemo3;

public class LombokAccessorsDemo3Test {

	public static void main(String[] args) {

		LombokAccessorsDemo3 lad3 = new LombokAccessorsDemo3();
		lad3.setName("Peter");
		lad3.setAdmin(true);
		lad3.setKey("xajc$2nac_acdpn$_kt");

		System.out.println("userName => " + lad3.getName());
		System.out.println("is_Admin => " + lad3.isAdmin());
		System.out.println("hash$key => " + lad3.getKey());
	}
}
