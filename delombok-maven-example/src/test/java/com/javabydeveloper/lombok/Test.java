package com.javabydeveloper.lombok;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		List<String> list = Arrays.asList(
				"Peter", 
				"Anand", 
				"John",
				"Gerhard",
				"Philip");

		/* list = [Peter, Anand, John, Gerhard, Philip] */

		Stream<String> stream = list.stream();
		
		/* map method produces a new stream after applying a function to each element of the original stream. */
		Stream<String> newStream = stream.map(s -> s.toUpperCase());
		List<String> newList = newStream.collect(Collectors.toList());

		/* newList = [PETER, ANAND, JOHN, GERHARD, PHILIP] */
	}
}
