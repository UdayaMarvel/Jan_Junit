package com.swiggy;
import java.util.Scanner;

public class Permutations {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string or number:");
		String input = sc.nextLine();
		
		System.out.println("All permutations are:");
		generatePermutations(input,"");
		
		
	}
	private static void generatePermutations(String str,String perm) {
		if(str.isEmpty()) {
			System.out.println(perm);
			return;
		}
		for(int i = 0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			String remaining = str.substring(0,i) + str.substring(i+1);
			generatePermutations(remaining, perm + currentChar);
			
			
		}
	}

}
