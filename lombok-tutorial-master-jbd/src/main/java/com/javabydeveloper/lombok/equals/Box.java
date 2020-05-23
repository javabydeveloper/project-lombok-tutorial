package com.javabydeveloper.lombok.equals;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Box extends Rectangle {

	private double height;
}
