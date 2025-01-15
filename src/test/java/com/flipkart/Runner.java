package com.flipkart;

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
//@SuiteClasses({search.class,offers.class})

public class Runner  
{
	public static void main(String[] args)
	{
		File f=new File("C:\\Users\\ANAND\\eclipse-workspace\\vasanthi\\ExcelRead\\src\\test\\resources\\Newfile.proper");
		Properties prop=new Properties();
		try
		{
			FileInputStream fi=new FileInputStream(f);
			//Properties prop=new Properties();
			try {
				prop.load(fi);
				String path=prop.getProperty("testdata");
				String user=prop.getProperty("username");
				String pw=prop.getProperty("passwod");
				System.out.println("TEST USER:"+path);
				System.out.println("USER NAME:"+user);
				System.out.println("PASSWORD:"+pw);
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}}
			catch(FileNotFoundException e)
		{
				e.printStackTrace();
		}
		try {
		FileOutputStream fo = new FileOutputStream(f);
		prop.setProperty("env","va");
		prop.setProperty("java","library");
		prop.save(fo,"Updated By Vasanthi");
		
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
				
}}
		
