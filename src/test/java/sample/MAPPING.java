package sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MAPPING {
	public static void main(String[] args)
	
	{
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter the string");
		//String str=s.nextLine();
		//String[] str1=str.split(" ");
				String n="Vasanthi anand shivani anand vasanthi";
				String[] c=n.split(" ");

				//char[]j=n.toCharArray();
		
	Map<String,Integer> g = new LinkedHashMap<String,Integer>();
	for(String x:c) {
		if(g.containsKey(x))
		{ 
			Integer a=g.get(x);
		g.put(x,a+1);
		}
		else
		{
			g.put(x,1);
		}
		}
		
		System.out.println(g);
	}

}





