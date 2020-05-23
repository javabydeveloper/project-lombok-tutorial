package com.javabydeveloper.lombok.constructor;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NoArgsDemo4 {

	private Long id;

	private String username;
}
