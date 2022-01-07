 package com.App;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatedSubString {
	
	
	public static void main(String[] args) {

		String Str = "abcdeabcabcdefghijklmn";
	
		LongestRepeatedSubString(Str);
	}
	
	
	public static void LongestRepeatedSubString(String Str)
	{
		String temporary="";
		String FinalsubString="";
		
		Set<Character> set = new HashSet<>();
		
		
		for(int i=0;i<Str.length();i++)
		{
			
			if(set.contains(Str.charAt(i))) 
					{
				           temporary="";
				
				
					}
			else {
				set.add(Str.charAt(i));
				temporary+=Str.charAt(i);
				
				
				if(temporary.length()>FinalsubString.length()) {
					FinalsubString=temporary;
					
				}
				
			}
			
			
			
		}
		
		System.out.println(FinalsubString);
		
	}

}
