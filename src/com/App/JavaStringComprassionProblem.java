package com.App;

import java.util.HashMap;
import java.util.Map;

public class JavaStringComprassionProblem {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="aaaabbbbccccddddeeeeeeeeeeeeeeeeeee";
		
		Map<Character,Integer> hmap= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(hmap.get(str.charAt(i))!=null)
			{
				hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
				
			}
			else
			{
				
				hmap.put(str.charAt(i),1);
				
			}
			
			
			
			
		}
		
		hmap.forEach((K,V)->System.out.print(K+""+V));

	}

}
