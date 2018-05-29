package com.idiada;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ShapeCalculator {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Shape shape = null;
		System.out.println("Select Shape from the below options");
		System.out.printf("1. Square\n2. Rectangle");
		switch (sc.nextInt()) {
		case 1:
			shape = new Square();
			break;
		case 2:
			shape = new Rectangle();
			break;
		default:
			System.out.println("Enter option number from above list");
		}
		shape.calculateArea();
	}
}
