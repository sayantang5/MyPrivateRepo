package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str="This is java  and it is very powerful";
		
		String[] split=str.split(" ");
		
		
		
	Integer[] in= {1,2,3,4,5,6,7,8,9};
	
	int[] inn= {1,2,3,4,5,6,7,8,9};
		
		
		
		
		
		List<String> asList = Arrays.asList(split);
		Collections.reverse(asList);
		
		asList.forEach(System.out::println);
		
		
		//----------------If you take wrapper class object as array then Arrays.asList(in) will generate List<Integer>
		//If you tale array of premitive value then List<int[]> will be cfreated .
		
		List<Integer> asList2 = Arrays.asList(in);
		
		Stream<int[]> asList3 = Arrays.asList(inn).stream();
		
		Stream<Integer> boxed = Arrays.stream(inn).boxed();

		
		
}
}
