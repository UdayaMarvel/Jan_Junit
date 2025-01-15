package com.swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Search.class, Offers.class})
public class TestRunner {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\January_Junit\\src\\test\\resources\\NewFile.property");
		Properties prop = new Properties();
		try {
		FileInputStream fi = new FileInputStream(f);
		
			try {
				prop.load(fi);
				String path = prop.getProperty("testdata");
				 String user = prop.getProperty("username");
				 System.out.println("Path" +path);
				 System.out.println("user" +user);
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
		FileOutputStream fo = new FileOutputStream(f);
		prop.setProperty("env", "qa");
		prop.setProperty("java", "library");
		prop.save(fo, "Updated By Udaya");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
