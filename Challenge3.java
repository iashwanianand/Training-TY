package com.technoelevate.Challenges;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 3 Integer numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		printEqual(x,y,z);
	}

	public static void printEqual(int x, int y, int z) {
		if(x<0 || y<0 || z<0) {
			System.out.println("Invalid Value");
		}
		else if(x==y && y==z) {
			System.out.println("All the numbers are Equal");
		}else {
			if(x!=y && y!=z && z!=x) {
				System.out.println("All are different");
			}else {
				System.out.println("Neither all are equal nor different");
			}
		}
	}
}