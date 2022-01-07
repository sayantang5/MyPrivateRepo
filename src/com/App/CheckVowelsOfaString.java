package com.App;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckVowelsOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String St="Check the string";
		String str =St.toLowerCase();
		
		String[] str1=str.split("");
		List<String> list1 =Arrays.asList("a","e","i","o","u");
		
		
		
	Set<String> vowellist=	Arrays.asList(str1).stream().filter(f->list1.contains(f)).collect(Collectors.toSet());//If you 
	vowellist.forEach(System.out::println);

	//If you use list then duplicate eliment willl come .
	
	
	}

}
