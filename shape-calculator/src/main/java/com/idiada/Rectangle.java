package com.idiada;

import java.util.Scanner;

public class Rectangle implements Shape {
	Scanner sc = new Scanner(System.in);
	
	public void calculateArea(){
		System.out.println("Enter Breadth of Rectangle");
		float breadth = sc.nextFloat();
		System.out.println("Enter Length of Rectangle");
		float length = sc.nextFloat();
		float area =  breadth * length;
		System.out.println("Area of Rectangle is : " +area);
	}
}
