package com.swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Sriram {
	public static Sriram test5 = null;
		public static Sriram getName() {
		if(test5==null) {
			test5 = new Sriram();
		}
		
		return test5;
	}
	
	private Sriram() {}
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\srira\\eclipse-workspace\\ExcelReadAndWrite\\src\\test\\resources\\NewFile.properties");
        try {
		FileInputStream f1 = new FileInputStream(f);
        Properties prop = new Properties();
           try {
        	   prop.load(f1);
           }
           catch(IOException e) {
        	   e.printStackTrace();
           }
           String name = prop.getProperty("name");
           System.out.println(name);
           String mailid = prop.getProperty("name");
           System.out.println(mailid);
           String dob = prop.getProperty("name");
           System.out.println(dob);
           String password = prop.getProperty("name");
           System.out.println(password);
           FileOutputStream f2 = new FileOutputStream(f);
           prop.setProperty("name", "Purushoth");
           prop.save(f2,"Updated the name");
        
        }
        catch(FileNotFoundException ex) {
        	ex.printStackTrace();
        }
        Sriram test1 = getName();
		System.out.println(System.identityHashCode(test1));
		Sriram test2 = getName();
		System.out.println(System.identityHashCode(test2));
		Sriram test3 = getName();
		System.out.println(System.identityHashCode(test3));
		Sriram test4 = getName();
		System.out.println(System.identityHashCode(test4));
	}

}
