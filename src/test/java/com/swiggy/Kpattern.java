package com.swiggy;

import java.util.Scanner;

public class Kpattern {
	public static void main(String[] args) {
        int n = 11; // Total number of rows
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= n / 2 + 1; j++) { // Inner loop for columns
                if (j == 1 || j == n / 2 + 2 - i || j == i - n / 2 - 1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}


