package com.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrangeCountOfCharacterInDescendingOrderiInString {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String Str="abbcccddddeeeeeffffff";
		String[] Array=Str.split("");
		//-----------------------------------------------------------------------------
		HashMap<String ,Integer> newMap = new HashMap<String ,Integer>();
		for(int i=0;i< Array.length;i++)
		{
			
			
			
			if(newMap.containsKey(Array[i])) {
				
				newMap.put(Array[i], newMap.get(Array[i])+1);
				
				
			}else 
			{
				
				newMap.put(Array[i],1);
				
			}
			
			
		}
		
		List<Map.Entry<String ,Integer>> newList  =new ArrayList<Map.Entry<String ,Integer>>(newMap.entrySet());
		
		Collections.sort(newList, new Comparator<Map.Entry<String ,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				
				
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
		
		
		
		for(Map.Entry<String ,Integer> entry :newList ) {
			
		System.out.println(entry.getKey()  +"    " +entry.getValue());
		
		
		}
		}
		
		
		
		//-----------------------------------------------------------------------------
		// List<String> asList = Arrays.asList(Array);
		
	/*	List<Entry<String, Long>> collect = Arrays.asList(Array).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().collect(Collectors.toList());
		
		Collections.sort(collect ,new Comparator<Map.Entry<String, Long>>() {


			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		
		for(Map.Entry<String, Long> entry : collect) {
			
			
			System.out.println("Char="+entry.getKey()+" frequency"+entry.getValue());
		}

	}*/

}
