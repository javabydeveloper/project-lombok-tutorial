package com.javabydeveloper.lombok.toString;

public class Rectangle {
	private double width;
	private double length;

	@Override
	public String toString() {
		return "Rectangle(width=" + this.width + ", length=" + this.length + ")";
	}
}
