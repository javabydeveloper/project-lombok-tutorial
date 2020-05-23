package com.javabydeveloper.demo.nonnull;

import com.javabydeveloper.lombok.nonnull.LombokNonNullDemo1;

public class LombokNonNullDemo1Test {

	public static void main(String[] args) {
		
		LombokNonNullDemo1 lnd1 = new LombokNonNullDemo1();
		
		lnd1.setId(Long.valueOf(1));
		lnd1.setRole(2);
		lnd1.setName(null);
		lnd1.setActive(true);
		
	}

}
