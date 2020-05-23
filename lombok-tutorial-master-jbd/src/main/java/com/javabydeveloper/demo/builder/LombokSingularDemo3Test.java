package com.javabydeveloper.demo.builder;

import com.javabydeveloper.lombok.builder.LombokSingularDemo1;
import com.javabydeveloper.lombok.builder.LombokSingularDemo3;
import com.sun.tools.javac.util.List;

public class LombokSingularDemo3Test {

	public static void main(String[] args) {
		
		LombokSingularDemo3 lsd3 = LombokSingularDemo3.builder()
				.id(Long.valueOf(1))
				.singleAircraft("Boeing XP-15")
				.singleAircraft("Avro 527")
				.aircraft(List.of("Sukhoi Su 47", "Supermarine 535"))
				.build();
		
		System.out.println(lsd3);
			
	}
}
