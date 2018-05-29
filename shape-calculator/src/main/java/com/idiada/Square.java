package com.idiada;

import java.util.Scanner;

public class Square implements Shape {

	Scanner sc = new Scanner(System.in);
	
	public void calculateArea(){
		System.out.println("Enter side length");
		float len = sc.nextFloat();
		float area = (float) Math.pow(len, 2);
		System.out.println("Area of Square is : " +area);
	}
}
