package com.swiggy;

import java.util.Scanner;

public class Dhamu {
	public static void main (String[] args) {
		System.out.println("Enter the value");
		Scanner admin = new Scanner (System.in);
		int value = admin.nextInt();
		for (int i = value; i >= 1; i--) {
			for (int j = i; j <= value; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= value; i++) {
			for (int j=i; j<=value; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
