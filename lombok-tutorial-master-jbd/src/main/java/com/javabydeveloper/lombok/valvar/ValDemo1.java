package com.javabydeveloper.lombok.valvar;

import lombok.val;
import lombok.var;

public class ValDemo1 {

	public static void main(String[] args) {
		
		val threshold = 10;
		var mydoubleval = 10.0;
		var myinval = 10;
		
		for(int i=0; i < threshold; i++ ) {
			System.out.println(mydoubleval);
			System.out.println("Value : "+ i);
		}
	}

}
