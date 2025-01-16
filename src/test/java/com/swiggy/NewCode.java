package com.swiggy;

public class NewCode {
	
	public static void main(String []arg){
			int a=1212;
			int i;
			int j=0;
			int n=a;
			while(a>0){
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j){
			System.out.println("it is a palindrome");
			
			}else
			{
				System.out.println("it is not a pali");
			}
			}
		}


