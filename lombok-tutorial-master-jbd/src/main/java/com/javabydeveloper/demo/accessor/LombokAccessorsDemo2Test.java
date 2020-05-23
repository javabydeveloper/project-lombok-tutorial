package com.javabydeveloper.demo.accessor;

import com.javabydeveloper.lombok.accessor.LombokAccessorsDemo2;

public class LombokAccessorsDemo2Test {

	public static void main(String[] args) {
		
         LombokAccessorsDemo2 lad2 = new LombokAccessorsDemo2()
        		 .setId(Long.valueOf(1))
        		 .setName("Peter");
         
         System.out.println("id => "+lad2.getId());
         System.out.println("name => "+lad2.getName());
	}
}
