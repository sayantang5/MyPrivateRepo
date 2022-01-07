package com.App;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstOfEachCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Finf first of each wors in a tring";
		
		String[] string = str.split(" ");
		
		List<Character> charr =Arrays.stream(string).map(s->s.charAt(0)).collect(Collectors.toList());
		
		charr.forEach(System.out::println);

	}

}
