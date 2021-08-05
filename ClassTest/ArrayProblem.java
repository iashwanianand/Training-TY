package com.technolelvate.ClassTest;

public class ArrayProblem {
	public static int crossing(int a[]) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j])
				count++;
				}
			}
		return count;
		}
	public static void main(String[] args) {
		int input[] = {1,1,0,0,1};
		System.out.println(crossing(input));
	}
}