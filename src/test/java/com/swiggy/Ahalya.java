package com.swiggy;

public class Ahalya {
public static void main(String[] args) {
		
		int a[]= {5,10,35,50,20,5};//Duplicate
	int y;
	
		for (int s=0;s<a.length;s++) {
			for (int k=s+1;k<a.length;k++) { 
				if(a[s]>a[k]) { //ascending order 
					y=a[s];
					a[s]=a[k];
					a[k]=y;
				}
				
				}
					System.out.println(a[s]);
					
				}
		System.out.println("maximum"+a[a.length-2]);//maximum 
}

}
