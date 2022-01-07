package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachElementOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="This is java  and it is very powerful";
		
		//StringBuilder input1 = new StringBuilder(str);
		
		String[] arr =str.split(" ");
		
		
		
		
		
		List<StringBuffer> collect = Arrays.stream(str.split(" ")).map(s->new StringBuffer(s).reverse()).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		//-------------------------------------------
		List<String> asList = Arrays.asList(arr);
		Collections.reverse(asList);
		
		asList.forEach(System.out::println);
		
		

	}

}
