package com.javabydeveloper.lombok.valvar;

import java.util.ArrayList;

import lombok.val;

public class ValDemo2 {

	public static void main(String[] args) {
		
		val names = new ArrayList<String>();
		
		names.add("Peter");
		names.add("Martin");
		names.add("Anand");
		
		for(val name : names) {
			System.out.println(name);
		}
	}

}
