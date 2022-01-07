package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		
		Integer[] intarray= new Integer[arr1.length];
		int i=0;
		for(int a : arr1)
		{
			
			intarray[i]=a;
			i++;
			
		}
		
		
		List<Integer> asList = Arrays.asList(intarray);
		Collections.reverse(asList);
		asList.forEach(r->System.out.print(r));
		
		System.out.println("**************************************");
		
		//----------------------------------------------------------------------------------//
		
		List<Integer> collect =  Arrays.stream(arr1).boxed().collect(Collectors.toList());
		Collections.reverse(collect);

		collect.forEach(r->System.out.print(r));
	}

}
