package com.javabydeveloper.demo.accessor;

import com.javabydeveloper.lombok.accessor.LombokAccessorsDemo4;

public class LombokAccessorsDemo4Test {

	public static void main(String[] args) {

		LombokAccessorsDemo4 lad4 = new LombokAccessorsDemo4()
		.setId(Long.valueOf(1))
		.userName("Peter");
		lad4.setActive(true);
		lad4.setAdmin(true);
		lad4.setAuthcode("dfjksldkf$bdb_$");
		lad4.setKey("xajc$2nac_acdpn$_kt");

		System.out.println("id => " + lad4.getId());
		System.out.println("userName => " + lad4.userName());
		System.out.println("active => " + lad4.isActive());
		System.out.println("is_Admin => " + lad4.isAdmin());
		System.out.println("authcode => " + lad4.getAuthcode());
		System.out.println("hash$key => " + lad4.getKey());
	}
}
