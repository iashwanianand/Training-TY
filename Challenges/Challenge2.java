package com.technoelevate.Challenges;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius = sc.nextDouble();
		System.out.println("Enter X of Rectangle");
		double x=sc.nextDouble();
		System.out.println("Enter Y of Rectangle");
		double y=sc.nextDouble();
		System.out.println("Area of Radius : "+area(radius));
		System.out.println("Area of Rectangle : "+area(x,y));
	}

	public static double area(double radius) {
		if(radius>=0.0) {
			return Math.PI*radius*radius;
		}else {
			return -1.0;
		}
	}
	public static double area(double x , double y) {
		if(x>=0 && y>=0){
			return x*y;
		}else {
			return -1.0;
		}
	}
}