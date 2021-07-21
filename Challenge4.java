package com.technoelevate.Challenges;

import java.util.Scanner;

public class Challenge4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("If summer Enter True or else false");
		boolean summer=sc.nextBoolean();
		System.out.println("Enter Temperature");
		int temperature=sc.nextInt();
		System.out.println("Cat Playing= "+isCatPlaying(summer,temperature));
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(summer==true) {
			if(temperature>=25 && temperature<=45) {
				return true;
			}else {
				return false;
			}
		}else {
			if(temperature>=25 && temperature<=35){
				return true;
			}else {
				return false;
			}
		}
	}
}