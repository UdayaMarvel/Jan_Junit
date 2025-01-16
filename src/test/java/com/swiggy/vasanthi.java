package com.swiggy;

import java.util.HashMap;
import java.util.Map;

public class vasanthi {
	
	public static void main(String[] args)
	
	{
		String n="Vasanthi";
		char[]F=n.toCharArray();
		
	Map<Character,Integer> g = new HashMap<Character,Integer>();
	for(Character x:F) {
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


