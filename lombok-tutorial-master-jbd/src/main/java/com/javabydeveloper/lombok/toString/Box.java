package com.javabydeveloper.lombok.toString;

import lombok.ToString;


@ToString(callSuper = true)
public class Box extends Rectangle {

	private double height;
}
