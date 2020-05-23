package com.javabydeveloper.lombok.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter 
@RequiredArgsConstructor
@ToString 
@EqualsAndHashCode
public class User1 {

	private Long id;
	private String username;
	
}
