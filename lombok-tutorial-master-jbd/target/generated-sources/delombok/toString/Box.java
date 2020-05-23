package com.javabydeveloper.lombok.toString;

public class Box extends Rectangle {
	private double height;

	@Override
	public String toString() {
		return "Box(super=" + super.toString() + ", height=" + this.height + ")";
	}
}
