package com.javabydeveloper.lombok.valvar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ValDemo3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Gerhard");
        list.add("Philip");
        list.add("John");
        
        //Consumer Example
        Consumer<String> c = name -> System.out.println(name);
        list.forEach(c);
	}

}
