package com.javabydeveloper.demo.accessor;

import com.javabydeveloper.lombok.accessor.LombokAccessorsDemo1;

public class LombokAccessorsDemo1Test {

	public static void main(String[] args) {
		
         LombokAccessorsDemo1 lad1 = new LombokAccessorsDemo1()
        		 .id(Long.valueOf(1))
        		 .name("Peter");
         
         System.out.println("id => "+lad1.id());
         System.out.println("name => "+lad1.name());
	}
}
