package com.swiggy;

import java.util.Scanner;

public class VinothKumar {

	public static void main(String[] args) {
		int number =1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
	    int  rows = s.nextInt();
	    
	    for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
       
	    }}}


	