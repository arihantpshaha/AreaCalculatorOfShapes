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
		int choice=0;
		
		do{ 
			System.out.println("Select Shape from the below options");
			System.out.printf("1. Square\n2. Rectangle\n3. Circle\n0. Exit");
			switch (choice=sc.nextInt()) {
		case 1:
			shape = new Square();
			shape.calculateArea();
			break;
		case 2:
			shape = new Rectangle();
			shape.calculateArea();
			break;
		case 3:
			shape = new Circle();
			shape.calculateArea();
			break;
		case 0:
			System.out.println("Closing Calculator");
			break;
		default:
			System.out.println("Enter option number from above list");
		}
		}
		while(choice!=0);
		System.exit(0);
	}
}
