package com.javabydeveloper.lombok.data;

import lombok.Data;

@Data(staticConstructor = "create")
public class User3 {

	private Long id;

	private String username;

}
