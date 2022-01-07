package com.App;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FirstOccurenceElementInArray {

	private static final String Continue = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 10, 1, 5, 1, 2, 1, 3 };

		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
		 * j++) { if (arr[i] == arr[j]) { System.out.println(arr[i]); return;
		 * 
		 * }
		 * 
		 * } }
		 */

		Set<Integer> hset = new HashSet<>();
		
		Optional<Integer> findFirst = Arrays.stream(arr).filter(s->!hset.add(s)).findFirst();
		System.out.println(findFirst.get());
		
		hset.forEach(s->System.out.println(s));
		
		
	}

}
