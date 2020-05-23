package com.javabydeveloper.demo.equals;

import com.javabydeveloper.lombok.equals.Box;
import com.javabydeveloper.lombok.equals.Rectangle;

public class EqualsHashCodeTest {

	public static void main(String[] args) {
		Box b1 = new Box(10.0);
		Box b2 = new Box(10.0);
		Box b3 = new Box(11.0);
		String b4 = "10.0";
		String b5 = null;
		
		Rectangle r1 = new Box(10.0);
		Rectangle r2 = r1;
		Rectangle r3 = new Rectangle();
		
		System.out.println("b1 == b2 => "+(b1 == b2));
		System.out.println("b1 == b3 => "+(b1 == b3));
		System.out.println("b1 == r1 => "+(b1 == r1));
		System.out.println("r1 == r2 => "+(r1 == r2));
		
		System.out.println("b1.equals(b2) => "+b1.equals(b2));
		System.out.println("b1.equals(b3) => "+b1.equals(b3));
		System.out.println("b1.equals(b4) => "+b1.equals(b4));
		System.out.println("b1.equals(b5) => "+b1.equals(b5));
		System.out.println("b1.equals(r1) => "+b1.equals(r1));
		System.out.println("b1.equals(r2) => "+b1.equals(r2));
		
		System.out.println("b1.equals(r1) => "+b1.equals(r3));
	}
}
