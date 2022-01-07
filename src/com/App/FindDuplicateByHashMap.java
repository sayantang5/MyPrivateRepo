package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateByHashMap {

	public static void main(String[] args) {

		String Str = "Java is a object oriented language and Java has many framework ";
		/*
		 * String[] Arr=Str.split(""); System.out.println();
		 */
		findDuplicate(Str);
	}
//----------------------------*******--------------------------------
	/*
	 * public static void findDuplicate(String str) {
	 * 
	 * String[] str1 = str.split(" ");
	 * 
	 * Map<String, Integer> map = new HashMap<>();
	 * 
	 * for (String s : str1) { if (map.get(s) == null) {
	 * 
	 * map.put(s, 1);
	 * 
	 * } else {
	 * 
	 * map.put(s, map.get(s) + 1); }
	 * 
	 * }
	 * 
	 * for (Map.Entry<String, Integer> Entry : map.entrySet()) {
	 * 
	 * int Trget = Entry.getValue(); if (Trget > 1) {
	 * System.out.print(Entry.getKey());
	 * 
	 * }
	 * 
	 * } }
	 */
//------------------------------*****************************------------------
	
	
	
	public static void findDuplicate(String str)
	{

		 String[] str1 = str.split(" ");
		 
		// char[] ch = str.toCharArray();
		  
		 
		
			/*
			 * Arrays.stream(str1) .collect(Collectors.groupingBy(Function.identity(),
			 * Collectors.counting())) .entrySet() .stream() .filter(entry ->
			 * entry.getValue() > 1) .map(Map.Entry::getKey) .forEach(System.out::println);
			 */
		 
		 
		 

		  Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(
		  ),Collectors.counting())).entrySet().stream()
		  .filter(Entry->Entry.getValue()>1).map(Entry->Entry.getKey()).forEachOrdered(
		  System.out::print);
		 
			
			/*
			 * Arrays.asList(str2).stream().collect(Collectors.groupingBy(Function.identity(
			 * ),Collectors.counting())).entrySet().stream()
			 * .filter(Entry->Entry.getValue()>1).map(Entry->Entry.getKey()).forEachOrdered(
			 * System.out::println);
			 * 
			 * str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)
			 * s))).
			 * collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
			 * entrySet().stream()
			 * .filter(entry->entry.getValue()>1).map(s->s.getKey()).forEach(System.out::
			 * print);
			 */
		  
		  
		  
	System.out.println("************************************************");
		  
		  
		List<String>  newlist= Arrays.asList(str1);
		newlist.stream().filter(i->Collections.frequency(newlist, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
			 
	}
	
	
	//str.chars()--> Java String chars() method returns an IntStream. The stream contains the integer code point values of the characters in the string object. This method was added to the String class in Java 9 release.
	//mapToObj()--> it returns the the stream of object .
	//-----------------------------------------------------*****************************------------------------------
}
