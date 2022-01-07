package com.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindOverLappingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {5,6,7,8,9};
		
		Overnale(arr1,arr2);

	}
	
	
	public static void Overnale(int[] arr1,int[] arr2) {
		

		//Set<Integer> set1 =new HashSet<>();
		List<Integer> set1 =new ArrayList<>();
		
		
		for(int i=0; i<arr1.length;i++)
		{
			
			set1.add(arr1[i]);
			
		}
		
		for(int i=0; i<arr2.length;i++)
		{
			
			if(set1.contains(arr2[i])) {
				
				
				System.out.println(arr2[i]);
			}
			
		}
		
		
		
		
		
	}

}
