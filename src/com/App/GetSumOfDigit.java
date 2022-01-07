package com.App;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetSumOfDigit {
	
	
	public static void main(String[] s) {
	
	 int  n=123;
	int sum = String.valueOf(n)
		    .chars()
		    .map(Character::getNumericValue)  //Character::getNumericValue
		    .sum();
	System.out.println(sum);
	
	
	String hello="Java";
	
	hello.chars()
    .mapToObj(i -> Character.valueOf((char)i))
    .forEach(System.out::println);
	
	

	String hello1="H";
	String str="H";
	
	int sum1 = hello1.chars().map( i->Character.getNumericValue(i))
    .sum();
	System.out.println(sum1);
	
	
	str.chars().map(x -> x + 4).forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	 int  n1=123;
		 long l = String.valueOf(n1)
			    .chars().mapToLong(Character::getNumericValue).sum();
		 
		 
		System.out.println(l);    
	
	
	}

	
	}




/*
 * 
 * String str = "Hello World"; "Hello World"
 * 
 * jshell> List<Character> charStr = new ArrayList<>(); charStr ==> []
 * 
 * jshell> str.chars().map(x -> x + 1).forEach(y ->
 * charStr.add(Character.valueOf((char) y)));
 * 
 * jshell> System.out.println(charStr); [I, f, m, m, p, !, X, p, s, m, e]
 */