package com.javabydeveloper.lombok.valvar;

import java.util.ArrayList;

public class ValDemo2 {
	public static void main(String[] args) {
		final java.util.ArrayList<java.lang.String> names = new ArrayList<String>();
		names.add("Peter");
		names.add("Martin");
		names.add("Anand");
		for (final java.lang.String name : names) {
			System.out.println(name);
		}
	}
}
